import java.util.*;
public class quickSort
{



  void quickSortt(int arr[], int low , int high)
  {
    if (low < high)
    {
      int partition = quickSortt(arr,low,high);
      quickSortt(arr, low, partition - 1);
      quickSortt(arr, partition + 1, high);
    }
  }




  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    int arr[] = {5,4,3,1,6,7,8,2};
    int n = arr.length;








    sc.close();
  }
}