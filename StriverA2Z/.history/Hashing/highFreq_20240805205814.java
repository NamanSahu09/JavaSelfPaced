package Hashing;
import java.util.*;
public class highFreq {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of elements you want to store in array ");
    int no = sc.nextInt();
    int arr[] = new int[no];
    for(int i=0;i<no;i++)
    {
      System.out.println("Enter element: "+ (i+1));
      arr[i] = sc.nextInt();
    }
    Map<Integer,Integer> map = 




    sc.close();
  }
}
