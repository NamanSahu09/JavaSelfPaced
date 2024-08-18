package Easy;
import java.util.ArrayList;
public class removeElementFromSortedArray 
{

  static void merge(int arr[],int low, int mid, int high)
  {
    ArrayList <Integer> list = new ArrayList<>();
    int left = low;
    int right = mid+1;
    while(left <= mid && right <=high)
    {
      if(arr[left] < arr[right])
      {
        list.add(arr[left]);
        left++;
      }
      else
    }

  }
  static void mergeSort(int arr[], int low, int high)
  {
    if(low >= high)
    return;
    int mid = low+(high-low)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid=1, high);
    merge(arr,low,mid,high);
  }



  public static void main(String args[])
  {
    int arr[] = {44,55,66,33,21,77,11};
    mergeSort(arr, 0, arr.length);



  }
  
}
