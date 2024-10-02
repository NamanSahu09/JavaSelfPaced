import java.util.*;
class reversePairs
{


  static int merge(int arr[],int low,int mid,int high)
  {
    int cnt=0;
    ArrayList<Integer> list = new ArrayList<>();
    int left = low;
    int right = mid+1;
    while(left<=mid && right<=high)
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
        cnt += mid-left+1;
      }
    }
    while(left<=mid)
    {
      list.add(arr[left]);
      left++;
    }
    while(right<=high)
    {
      list.add(arr[right]);
      right++;
    }
    for(int i=low;i<=high;i++)
    {
      arr[i]=list.get(i-low);
    }
    return cnt;
  }




  static int mergeSort(int arr[],int low,int high)
  {
    int cnt=0;
    if(low>=high)
    return cnt;

    int mid = low+(high-low) / 2;
    cnt+= mergeSort(arr, low, mid);
    cnt+= mergeSort(arr, mid+1, high);
    cnt+=merge(arr,low,mid,high);
    return cnt;

  }



 
  static int reversePair(int arr[])
  {
    return mergeSort(arr,0,arr.length-1);

  }





  public static void main(String args[])
  {
    int[] arr = {1, 3, 2, 4, 5};
    int reversePairs = reversePair(arr);
    System.out.println("Number of reverse pairs: " + reversePairs); 
  }
}