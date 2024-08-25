package Array.Easy;

public class numbersTwice 
{
  public static void main(String args[])
   {
    
    int arr[] = {1,1,2,2,3,4,4,5,5};

    //Bruteforce approach
    int n = arr.length;
    int k = -1;
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        if(i == j)
        continue;
        if(arr[i] == arr[j])
        {
          k=-1;
          break;
        }
        if(arr[i] != arr[j])
        {k = arr[i];
      }
    }
    System.out.println(k);





  }
  
}
