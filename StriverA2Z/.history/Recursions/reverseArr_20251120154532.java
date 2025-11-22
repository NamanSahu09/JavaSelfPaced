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
 
  static void f(int arr[], int l, int r)
  {
    if(l == r)
    {
      return;
    }
    //swap
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    f(arr, l+1, r-1);

  }


}