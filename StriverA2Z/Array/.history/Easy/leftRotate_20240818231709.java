package Easy;
import java.util.*;
public class leftRotate 
{
  public static void main(String args[])
  {
    int arr[] = {22,4,55,21,66,77,43};
    int temp = arr[0];

    for(int i:)

    for(int i=0;i<arr.length-1;i++)
    {
      arr[i] = arr[i+1];
    }
    arr[arr.length-1] = temp;
    System.out.println("Array after left rotation by 1:");
    for(int i=0; i<arr.length; i++)
    {
      System.out.print(arr[i]+" ");
    }


  }
}
