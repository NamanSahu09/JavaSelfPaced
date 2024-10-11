package Array.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
  
    static public boolean linearSearch(int arr[],int no)
    {
      int n = arr.length;
      for(int i=0;i<n;i++)
      {
        if(arr[i] == no)
        return true;
      }
      return false;

    }

    public static void main(String args[])
    {
      int arr[] = {102,4,100,1,101,3,2,1,1};
      //BRUTEFORCE

      /*  int maxi=0;
      int count =0;
      int n=arr.length;
      for(int i=0;i<n;i++)
      {
        int no = arr[i];
        count =1;
        while(linearSearch(arr,no+1))
        {
          count++;
          no = no+1;
        }
        maxi = Math.max(maxi,count);
      }
  
     System.out.println("Longest consecutive sequence is: "+ maxi);
     */
  
        


     //BETTER APPROACH
     /*Arrays.sort(arr);
     int maxi=0;
     int lastSmall = Integer.MIN_VALUE;
     int count =1;
     for(int i=0;i<arr.length;i++)
     {  
      if(arr[i]-1 == lastSmall)
      {
        count++;
        lastSmall = arr[i];
      }
      else if(arr[i]-1 != lastSmall)
      {
        count = 1;
        lastSmall = arr[i];
      }
      maxi = Math.max(maxi,count);
     }
     System.out.println("Longest consecutive sequence is: "+ maxi);*/






     //OPTIMAL APPROACH
     HashSet<Integer> set = new HashSet<>();
     int n = arr.length;
     int count =1;
     int longest = 0;
     for(int i=0;i<n;i++)
     {
        set.add(arr[i]);
     }
     int no=0;
     for(int i=0;i<n;i++)
     {
      if(!set.contains(arr[i]-1))
      {
        no = arr[i];
        count =1;
        while(set.contains(no+1))
        {
          count++;
          no++;
        }
        longest = Math.max(longest,count);
      }
     }
     System.out.println("Longest consecutive sequence is: "+ longest);





    }
    
  
  
  
}
