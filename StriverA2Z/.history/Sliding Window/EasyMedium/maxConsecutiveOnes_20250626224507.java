class Solution {
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
}