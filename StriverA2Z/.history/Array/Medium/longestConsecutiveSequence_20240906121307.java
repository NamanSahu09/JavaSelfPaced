package Array.Medium;

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
  
  
    }
    
  
  
  
}