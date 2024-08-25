package Array.Easy;

import java.util.HashMap;
import java.util.Scanner;
public class longestSubarray 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,1,1,1,3,3};


    //Better approach
    HashMap <Long, Integer> mapSum = new HashMap<>();
    long sum=0;
    int maxLen=0;
    int n = arr.length;
    System.out.println("Enter Subarray Sum: ");
    int k = sc.nextInt();
    for(int i=0;i<n;i++)
    {
      sum+=arr[i];
      if(sum == k)
      {
        maxLen = Math.max(maxLen,i+1);
      }
      long rem = sum - k;
      if(mapSum.containsKey(rem))
      {
        int len = i - mapSum.get(rem);
        maxLen = Math.max(maxLen, len);
      }
      if(!mapSum.containsKey(sum))
      {
        mapSum.put(sum,i);
      }
    }
    System.out.println("Longest Subarray in sequence is: "+maxLen);


    int arr1[] = {1,2,3,1,1,1,3,3};

    //Optimal Approach
    int left =0;
    int right =0;
    long sum1 =0;
    while(right < n)
    {

      right++;
      if(right < n)
      {
        

      }

    }




  }
  
}
