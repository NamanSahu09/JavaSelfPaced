import java.util.*;
class reversePairs
{




  static int reversePair(int arr[],int n)





  public static void main(String args[])
  {
    int[] arr = {1, 3, 2, 4, 5};
    int n = arr.length;
    int reversePairs = reversePair(arr, 0, n-1);
    System.out.println("Number of reverse pairs: " + reversePairs); 
  }
}