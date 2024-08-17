import java.util.*;
public class bubbleSortRecursive {
  

  static void bubbleSortRecursive(int arr[],int no)
  {
    if(no == 1)
    return;
    
    for(int j =1 ;j<no-1;j++)
    {
      boolean swapped = false;
      if(arr[j] < arr[j+1])
      {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        swapped = true;
      }
      if(swapped == false)
      return;
    }
    bubbleSortRecursive(arr, no-1);
  }
  static void printArray(int arr[],int no)
  {
    for(int i:arr)
    System.out.print(i+" ");
    System.out.println();
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
