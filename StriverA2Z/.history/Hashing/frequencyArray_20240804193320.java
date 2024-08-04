package Hashing;
import java.util.*;
public class frequencyArray {

public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);

  int no;
  System.out.println("Enter number of elements you want to enter in array ");
  no = sc.nextInt();
  int arr[] = new int[no];
  //Input done
  for(int i=0; i<no;i++)
  {
    System.out.println("Enter element : "+ i+1);
    arr[i] = sc.nextInt();
  }

  //Pre-Compute
  HashMap <Integer, Integer> map = new HashMap<>();

  for(int i=0;i<no;i++)
  {
    if(map.containsKey(arr[i]))
    {
      map.put(arr[i], map.get(arr[i])+1);
    }
    else
    map.put(arr[i] , 1);
  }
  //Printing frequency
  for(Map.Entry<Integer, Integer> entry : map.entrySet())
  {
    System.out.println();
  } 
  




}


}
