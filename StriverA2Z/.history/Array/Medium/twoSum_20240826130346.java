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
    int res[] = new int[2];boolean found = false;
    for(int i=0;i<arr.length;i++)
    {
      int no = arr[i];
      int rem = target - no;
      if(map.containsKey(rem))
      {
        res[0]=map.get(rem);
        res[1]=i;
        found = true;
        break;

      }
      else
      map.put(arr[i],i);
    }
    if (found) {
      System.out.println("Indices: " + res[0] + ", " + res[1]);
  } else {
      System.out.println("No solution found.");
  }




  }
}