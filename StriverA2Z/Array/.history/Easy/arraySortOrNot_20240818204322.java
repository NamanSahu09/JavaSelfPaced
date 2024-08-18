package Easy;

public class arraySortOrNot 
{
  public static boolean isSorted(int[] arr, int l)
  {
    for (int i = 0; i < l - 1; i++) 
    {
      if(arr[i] < arr[i+1])
      {
        return false;
      }


    }


  }
  public static void main(String args[])
  {
    int arr[] = {20,11,34,2,35,66};
    isSorted(arr,arr.length);


  }
  
}
