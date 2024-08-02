import java.util.*;
public class loopSwapjavajava
{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter total number of elements ");
      int no = sc.nextInt();
      int[] arr = new int[no];
      for(int i=0;i<arr.length;i++)
      {
        System.out.println("Enter element number: "+ (i+1));
        arr[i] = sc.nextInt();
      }
      System.out.println("Array is : ");
      for(int i: arr)
      {
        System.out.print(i+" ");
      }

      System.out.println("Reversing the array");

      reverseArray(arr,no);


      sc.close();
    }

    static void reverseArray(int arr[],int no)
    {
      for(int i=0;i<no/2;i++)
      {
        int temp = arr[i];
        arr[i] = arr[no-i-1];
        arr[no-i-1] = temp;
       
      }
      System.out.println("Reversed array is : ");
      for(int i: arr)
      {
        System.out.print(i+" ");
      }
    }


    //RECURSIVE METHOD

    void reverseRecursive(int i,int arr[], int no)
    {
        if(i >= no /2)
        return;

        reverseArray(, no);

    }

}