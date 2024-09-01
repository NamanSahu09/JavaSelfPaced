import java.util.*;
public class kadanesAlgo 
{

  public int maxSubArray(int[] nums) 
    {
        //Optimal Solution
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum < 0)
            sum=0;
        }
        return max;
        
    }



  public static void main(String args[])
  {
    
    





  }
  
}
