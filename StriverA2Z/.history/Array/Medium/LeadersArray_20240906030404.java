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
    int left = list.get(0);
    int right = list.size()-1;
    while(left < right)
    {
      int temp = list.get(left);
      list.set(left, list.get(right));
      list.set(right, temp);
      
    }
    for(int i:list)
    {
      System.out.println(i);
    }



  }
  
}
