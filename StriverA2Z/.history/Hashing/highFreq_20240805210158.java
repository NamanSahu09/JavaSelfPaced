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
    //compute
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<no;i++)
    {
      if(map.containsKey(arr[i]))
      {
        map.put(arr[i],map.get(arr[i])+1);
      }
      else
      {
        map.put(arr[i],1);
      }
    }

    int highKey=0, highValue=0;
    int lowKey =0, lowValue=0;

    for(Map.Entry<Integer,Integer> entry : map.entrySet())
    {
      if(entry.getValue() > highValue)
      {
        highKey = entry.getKey();
        highValue = entry.getValue();
      }
      
      if(entry.getValue() )
    }




    sc.close();
  }
}
