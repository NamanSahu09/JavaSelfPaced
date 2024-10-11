package Array.Medium;

public class longestConsecutiveSequence {
  
    public static void main(String args[])
    {
      int arr[] = {102,4,100,1,101,3,2,1,1};
      //BRUTEFORCE

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
      }
  
  
  
  
    }
    
  
  
  
}
