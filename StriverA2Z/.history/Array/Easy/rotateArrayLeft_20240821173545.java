package Array.Easy;
import java.util.*;
public class rotateArrayLeft {
  



  static void rotateArray(int arr[],int l, int d)
  {
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,l-1);
  }





  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4,5,6,7};

    System.out.println("enter shift places ");
    int d = sc.nextInt();
    int l = arr.length;
    rotateArray(arr,l,d);


    sc.close();

  }



}
