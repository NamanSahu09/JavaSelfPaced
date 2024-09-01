import java.util.HashMap;
import java.util.Scanner;

public class twoSum
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int arr[] = {2,7,11,15};
    System.out.println("Enter target: ");
    int target = sc.nextInt();
    HashMap <Integer,Integer> map = new HashMap<>();

    for(int i=0;i<arr.length;i++)
    {
      int no = arr[i];
      int rem = target - no;
      if(map.containsKey(rem))
      {
        
      }
    }




  }
}