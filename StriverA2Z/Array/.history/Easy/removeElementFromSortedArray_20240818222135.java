package Easy;
import java.util.ArrayList;
import java.util.HashSet;
public class removeElementFromSortedArray 
{

  static void merge(int arr[],int low, int mid, int high)
  {
    ArrayList <Integer> list = new ArrayList<>();
    int left = low;
    int right = mid+1;
    while(left <= mid && right <= high)
    {
      if(arr[left] <= arr[right])
      {
        list.add(arr[left]);
        left++;
      }
      else
      {
        list.add(arr[right]);
        right++;
      }
    }
    while(left <= mid)
    {
      list.add(arr[left]);
      left++;
    }
    while(right <= high)
    {
      list.add(arr[right]);
      right++;
    }
    for(int i=low; i<=high; i++)
    {
      arr[i] = list.get(i-low);
    }
  }
  static void mergeSort(int arr[], int low, int high)
  {
    if(low >= high)
    return;
    int mid = low+(high-low)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr,low,mid,high);
  }


  static void removeDuplicatesBrute(int arr[])
  {
    int l = arr.length-1;

    HashSet <Integer> set = new HashSet<>();
    for(int i=0;i<l;i++)
    {
      set.add(arr[i]);
    }
    int j=0;
    for(int i=0;i<l;i++)
    {




  }

  public static void main(String args[])
  {
    int arr[] = {44,55,66,33,21,77,11};
    mergeSort(arr, 0, arr.length-1);
    for(int i:arr)
    {
      System.out.print(i+" ");
    }
    
    removeDuplicatesBrute(arr);

  }
  
}
