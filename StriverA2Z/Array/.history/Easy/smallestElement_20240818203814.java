package Easy;

public class smallestElement 
{

  static void smallestElement(int arr[], int l)
  {
    
    int smallest = arr[0];
    int ssmallest = Integer.MAX_VALUE;

    for(int i=1;i<l;i++)
    {
      if(arr[i] < smallest)
      {
        ssmallest = smallest;
        smallest = arr[i];
      }

      if(arr[i] < ssmallest && arr[i] != smallest)
      {
        ssmallest = arr[i];
      }

    }
    System.out.println("Smallest Element in array is: "+ smallest + "\nSecond Smallest is: "+slargest);


  }




  public static void main(String args[])
  {
    int arr[] = {20,11,34,2,35,66};
    smallestElement(arr,arr.length);


  }
}