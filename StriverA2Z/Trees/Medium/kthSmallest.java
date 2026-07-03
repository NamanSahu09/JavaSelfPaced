import java.util.*;
// kth smallest java

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

class kthSmallest
{
  private int count = 0;
  private int result = -1;

  public int kthSmallest(TreeNode root, int k) 
  {
    count = 0;
    result = -1;
    inorder(root, k);
    return result;
  }
  
  private void inorder(TreeNode root, int k)
  {
    if (root == null) return;

    inorder(root.left, k);

    if (count < k) 
    {
      count++;
      if (count == k) 
      {
        result = root.val;
        return;
      }
      inorder(root.right, k);
    }
  }

  public static void main(String args[])
  {
    kthSmallest obj = new kthSmallest();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(1);
    root.right = new TreeNode(4);
    root.left.right = new TreeNode(2);
    System.out.println(obj.kthSmallest(root, 1)); // Expected: 1
    System.out.println(obj.kthSmallest(root, 2)); // Expected: 2
    System.out.println(obj.kthSmallest(root, 3)); // Expected: 3
    System.out.println(obj.kthSmallest(root, 4)); // Expected: 4
  }
}