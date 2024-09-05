package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersArray 
{
  public static void main(String[] args) // corrected parameter name
  {
    int arr[] = {10, 22, 12, 3, 0, 6};
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> list = new ArrayList<>();
    
    // Traverse the array from right to left
    for(int i = arr.length - 1; i >= 0; i--) 
    {
      if(arr[i] > max) 
      {
        max = arr[i];
        list.add(max); // Add the leader to the list
      }
    }
    
    System.out.println("Leaders in array: ");
    
    // Reverse the list of leaders (because we added them in reverse order)
    Collections.reverse(list); 

    // Print the leaders
    for(int i : list) 
    {
      System.out.println(i);
    }
  }
}
