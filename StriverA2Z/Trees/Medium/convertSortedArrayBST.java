import java.util.*;
// convert sorted array to Binary Search Tree
// <=1 

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

class convertSortedArrayBST
{

  public TreeNode helper(int[] nums, int left, int right)
  {
    if(left > right)
      return null;

    int mid = left + (right - left) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = helper(nums, left, mid-1);
    root.right = helper(nums, mid+1, right);
    return root;
  }


  public TreeNode sortedArrayToBST(int[] nums)
  {
    int n = nums.length;
    return helper(nums, 0, n-1);
  }

  public static void main(String args[])
  {
    convertSortedArrayBST obj = new convertSortedArrayBST();
    int[] nums = {-10, -3, 0, 5, 9};
    TreeNode root = obj.sortedArrayToBST(nums);
  }
}