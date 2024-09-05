package Array.Medium;

import java.util.ArrayList;

public class LeadersArray 
{
  public static void main(String argsp[])
  {
    int arr[] = {10,22,12,6,0,3};
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=arr.length-1; i>=0;i++)
    {
      if(arr[i] > max)
      {
        max = arr[i];
        list.add(null)
      }
    }



  }
  
}
