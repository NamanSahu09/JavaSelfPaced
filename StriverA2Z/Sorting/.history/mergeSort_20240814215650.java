import java.util.*;
import java.util.ArrayList;

public class mergeSort
{


  static void merge(int arr[],int low,int mid, int high)
  {

    ArrayList <Integer> list = new ArrayList<>();
    int left = low;
    int  right = mid+1;
    while(left <= mid && right <= high )
    {
      if(arr[left] <= arr[right])
      {
        list.add(left);
        left++;
      }
      else 
      {
        list.add(right);
        right++;
      }
    }
    if(left <= mid)
    {
    }



  }



  static void mergeSort(int arr[], int left, int right)
  {
    if(left <= right)
    return;
    int mid = left + (right - left) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr,mid+1,right);
    merge(arr,left,mid,right);
  }


  public static void main(String args[])
  {
    int arr[] = {5,2,10,3,55,44,1};
    int left = 0;
    int right = arr.length - 1;
    mergeSort(arr,left,right);
  }
}
