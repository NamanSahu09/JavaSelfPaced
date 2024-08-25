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
      int rem = i - k;
      if(mapSum.containsKey(rem))



    }



  }
  
}
