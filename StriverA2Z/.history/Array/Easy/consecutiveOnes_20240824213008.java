package Array.Easy;

public class consecutiveOnes {
  public static void main(String args[])
  {
    int arr[] = {1,1,1,0,1,1,0,1,1,1,0,0,0,1};

    int max =0;
    int count =0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i] == 1)
      {
        count+=1;
        if(count > max)
        {
          max = count;
        }
      }
      if(arr[i] == 0)
      {
        count = 0;
      }
    }
    System.out.println()
    
  }
  
}
