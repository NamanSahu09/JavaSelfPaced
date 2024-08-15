import java.util.*;
public class insertionSort {
  

  public static void insertionSort(int arr[], int n)
  {
    int j=0;
    for(int i=0;i<n;i++)
    {
      j = i;
      while(j > 0 && arr[j-1] > arr[j])
      {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }

    }

  }

  public static void printArray(int arr[], int n)
  {
    for(int i:arr)
    {
      System.out.print(i+" ");
    }
  }





  public static void main(String args[])
  {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = arr.length;
    insertionSort(arr, n);
    for(int i: arr)
    System.out.print();
    System.out.println("Sorted array");
    printArray(arr, n);
  }

}
