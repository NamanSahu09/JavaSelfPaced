import java.util.*;
import java.util.ArrayList;

public class mergeSort
{

  static void mergeSort(int arr[], int left, int right)
  {
    if(left <= right)
    return;
    int mid = left + (right - left) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr,mid+1,right);
    mergeSort
  }


  public static void main(String args[])
  {
    int arr[] = {5,2,10,3,55,44,1};
    int left = 0;
    int right = arr.length - 1;
    mergeSort(arr,left,right);
  }
}
