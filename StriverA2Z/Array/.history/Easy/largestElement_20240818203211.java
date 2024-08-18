package Easy;
public class largestElement
{
  static void largestElement(int arr[], int l)
  {
    int largest = Integer.MIN_VALUE;
    int slargest = -1;
    for(int i=0;i<l;i++)
    {
      if(arr[i] > largest)
      {
        slargest = largest;
        largest = arr[i];
      }
      if(arr[i] > slargest && arr[i] < largest)
      {
        slargest = arr[i];
      }
    }
    System.out.println("Largest Element in array is: ")

  }
  public static void main(String args[])
  {
    int arr[] = {20,11,34,2,35,66};
    largestElement(arr,arr.length);


  }
}