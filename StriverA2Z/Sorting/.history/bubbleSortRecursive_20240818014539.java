import java.util.*;
public class bubbleSortRecursive {
  

  static void bubbleSortRecursive(int arr[],int no)
  {
     
  }




  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Array Inserted: ");
    for(int i: arr)
    System.out.print(i+" ");

    bubbleSortRecursive(arr, arr.length-1);
    System.out.println("Sorted array");
    printArray(arr, arr.length);

  }



}
