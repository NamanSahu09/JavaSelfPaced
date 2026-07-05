//write a program for boundaryTraversal
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class boundaryTraversal 
{


  public ArrayList<Integer> boundaryTraversal(TreeNode root)
  {
      ArrayList<Integer> list = new ArrayList<>();
      if(root == null) return list;
      if(isLeaf(root) == false) list.add(root.val);
      leftBoundary(root.left, list);
      leafNodes(root, list);
      rightBoundaryR(root.right, list);
      return list;
  }

  boolean isLeaf(TreeNode root)
  {
    if(root.left == null && root.right == null) 
      return true;

    return false;
  }


  public void leftBoundary(TreeNode root, ArrayList<Integer> res)
  {
    if(root == null) return;
    while(root != null)
    {
      if(isLeaf(root) == false) res.add(root.val);
      if(root.left != null) root = root.left;
      else root = root.right;
    }
  }

  public void leafNodes(TreeNode root, ArrayList<Integer> res)
  {
    if(root == null) return;
    if(isLeaf(root) == true) 
    {
      res.add(root.val);
      return;
    }
    leafNodes(root.left,res);
    leafNodes(root.right,res);
  }





  public void rightBoundaryR(TreeNode root, ArrayList<Integer> res)
  {
    ArrayList<Integer> rev = new ArrayList<>();
    while(root != null)
    {
      if(isLeaf(root) == false) rev.add(root.val);
      if(root.right != null) root = root.right;
      else root = root.left;
    }
    for(int i= rev.size()-1;i>=0;i--)
    {
      res.add(rev.get(i));
    }
  }



  public static TreeNode buildTree(String[] arr)
  {
    if (arr == null || arr.length == 0 || arr[0].equals("N")) return null;
    TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int i = 1;
    while (!q.isEmpty() && i < arr.length)
    {
      TreeNode curr = q.poll();
      
      // Left child
      if (!arr[i].equals("N"))
      {
        curr.left = new TreeNode(Integer.parseInt(arr[i]));
        q.add(curr.left);
      }
      i++;
      
      if (i >= arr.length) break;
      
      // Right child
      if (!arr[i].equals("N"))
      {
        curr.right = new TreeNode(Integer.parseInt(arr[i]));
        q.add(curr.right);
      }
      i++;
    }
    return root;
  }

  public static void main(String args[])
  {
    boundaryTraversal obj = new boundaryTraversal();
    
    // Level-order array representation of the tree
    String[] arr = {"1", "2", "3", "4", "5", "6", "7", "N", "N", "8", "9", "N", "N", "N", "N"};
    TreeNode root = buildTree(arr);

    ArrayList<Integer> result = obj.boundaryTraversal(root);
    System.out.println("Boundary Traversal: " + result);
  }
  
}
