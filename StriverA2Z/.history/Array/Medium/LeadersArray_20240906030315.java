package Array.Medium;

import java.util.ArrayList;

public class LeadersArray 
{
  public static void main(String argsp[])
  {
    int arr[] = {10,22,12,3,0,6};
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=arr.length-1; i>=0;i--)
    {
      if(arr[i] > max)
      {
        max = arr[i];
        list.add(max);
      }
    }
    System.out.println("Leaders in array: ");
    int left = list.get()
    for(int i:list)
    {
      System.out.println(i);
    }



  }
  
}
