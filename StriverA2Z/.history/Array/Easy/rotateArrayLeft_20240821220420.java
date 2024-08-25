package Array.Easy;
import java.util.*;
public class rotateArrayLeft {
  

  static void reverse(int arr[],int left,int right)
  {
    while(left <= right)
    {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }


  static void rotateArray(int arr[],int l, int d)
  {
    reverse(arr,0,(l-d)-1);
    reverse(arr,(l-d),l-1);
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

    System.out.println("array after shift is: ");
    for(int i:arr)
    System.out.print(i+" ");


    sc.close();

  }



}
