import java.util.*;
class IndexesofSubarraySum
{
  public static int[] subarraySum(int[] nums, int k) 
  {
    for(int i = 0; i < nums.length; i++)
    {
      int sum = 0;
      
    }





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