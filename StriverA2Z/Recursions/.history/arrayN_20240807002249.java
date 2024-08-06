import java.util.*;
public class arrayN {


   static void fun(int arr[] , int no)
  {
    Scanner sc = new Scanner(System.in);
    if (no == -1)
    return;
    fun(arr, no - 1);
    System.out.println("Enter element");
    arr[no] = sc.nextInt();
    
  }


  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int no;
    System.out.println("Enter total number ");
    no = sc.nextInt();
    int[] arr = new int[no];
    fun(arr, no-1);
    for(int i:arr)
    {
      System.out.print(i+" ");
    }

  }

}
