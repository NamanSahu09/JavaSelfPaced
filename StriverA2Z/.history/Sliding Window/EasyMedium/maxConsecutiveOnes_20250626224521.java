import java.util.*;
class OnesMax3 {
  public int longestOnes(int[] nums, int k) 
  {
      int left = 0, right = 0, maxLen = 0;
      int zero = 0,len=0;
      while(right < nums.length)
      {
          if(nums[right] == 0)
          zero++;
          if(zero <= k)
          {
              len = right - left + 1;
              maxLen = Math.max(maxLen, len);
          }
          if(zero > k)
          {
              if(nums[left] == 0)
              zero--;
              left++;
          }
          right++;
      }
      return maxLen;
      
  }
  

  public static void main(String[] args) 
  {
      Solution obj = new Solution();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n = sc.nextInt();
      int[] nums = new int[n];
      System.out.println("Enter the elements of the array (0s and 1s):");
      for(int i=0; i<n; i++)
      {
          nums[i] = sc.nextInt();
      }
      System.out.println("Enter the maximum number of flips allowed:");
      int k = sc.nextInt();
      int result = obj.longestOnes(nums, k);
      System.out.println("The length of the longest subarray with at most " + k + " flips is: " + result);
      sc.close();
  }
}