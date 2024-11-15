import java.util.*;
class IndexesofSubarraySum
{
  public static int[] subarraySum(int[] nums, int k) 
  {
    int[] ans = new int[2];
    for(int i = 0; i < nums.length; i++)
    {
      int sum = 0;
      for(int j = i; j < nums.length; j++)
      {
        sum += nums[j];
        if(sum == k)
        {
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }


    ans[0] = -1


  }


  public static void main(String[] args)
  {
    int[] arr = {1, 2, 3, 7, 5};
    int target = 12;
    int[] ans= new int[2];
    ans = subarraySum(arr, target);
    System.out.println(Arrays.toString(ans));
    // Output: [2, 4]
  }
}