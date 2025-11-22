import java.util.*;
public class reverseArr
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4,5,6,7,8};
    int n = arr.length;
    f(arr,0,n-1);
  }
 
  static void f(int arr[], int i, int j)
  {
    if(i >= j)
    {
      System.out.println(Arrays.toString(arr));
      return;
    }
    //swap
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    
    f(arr, i+1, j-1);
  }


}