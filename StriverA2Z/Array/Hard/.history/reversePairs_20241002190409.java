import java.util.*;
class reversePairs
{


  static int mergeSort(int arr[],int low,int high)
  {
    int cnt=0;
    if(low>=high)
    return cnt;

    int mid = low+(high-low) / 2;

  }




  static int reversePair(int arr[])
  {
    return mergeSort(arr,0,arr.length-1);

  }





  public static void main(String args[])
  {
    int[] arr = {1, 3, 2, 4, 5};
    int n = arr.length;
    int reversePairs = reversePair(arr);
    System.out.println("Number of reverse pairs: " + reversePairs); 
  }
}