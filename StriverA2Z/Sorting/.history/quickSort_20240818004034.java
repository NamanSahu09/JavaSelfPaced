import java.util.*;
public class quickSort
{

  int sortt(int arr[],int low,int high)
  {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while(i<j)
    {
      while(arr[i] <= arr[pivot] && i <= high)
      {
        i++;
      }
      while(arr[j] > arr[pivot] && j >= low)
      {
        j--;
      }
      if(i<j)
      {
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
      }
    }





    return 1;
  }





  void quickSortt(int arr[], int low , int high)
  {
    if (low < high)
    {
      int partition = sortt(arr,low,high);
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