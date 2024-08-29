public class dutchNationalFlag 
{
  public static void main(String args[]){
  //sorting of 0 1 2
  int arr[] = {2,1,2,2,0,0,2};
  int low=0;
  int mid=0;
  int high=arr.length-1;
  while(mid<=high)
  {
    if(arr[mid] == 2)
    {
      int temp = arr[mid];
      arr[mid] = arr[high];
      arr[high] = temp;
      high--;
    }
    else if(arr[mid] == 1)
    mid++;
    else
    {
      int temp = arr[low];
      arr[low] = arr[mid];
      arr[mid] = temp;
      low++;
      mid++;
    }

    for(int i=0i<n)

     }
  }
}
