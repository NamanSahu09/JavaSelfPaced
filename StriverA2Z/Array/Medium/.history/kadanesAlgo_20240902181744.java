import java.util.*;
public class kadanesAlgo 
{

  static int maxSubArray(int[] nums) 
    {
        //Optimal Solution
        int max = Integer.MIN_VALUE;
        int sum = 0,k=0;
        int startIdx = 0, endIdx =0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum+=nums[i];
        //     max=Math.max(sum,max);
        //     if(sum < 0
        //     sum=0;
        // }
        for(int i=0;i<nums.length;i++)
        {
          sum+= nums[i];
          if(k==0 && sum > 0)
          {
            startIdx = i;
          }
          if(sum>max)
          {
            endIdx = i;
            max = sum;
          }
          if(sum < 0)
          {
            sum=0;
          }

        }
        System.out.println("Start Index: "+startIdx+" End Index: "+endIdx);
        return max;
        
    }



  public static void main(String args[])
  {
    
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println("Max Sum: "+ maxSubArray(arr));

  }
  
}
