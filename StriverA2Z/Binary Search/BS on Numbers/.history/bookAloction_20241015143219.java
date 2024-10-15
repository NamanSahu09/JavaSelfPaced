import java.util.*;
public class bookAloction
{


  public boolean isPossible(int arr[], int dist, int cows)
  {
    int n = arr.length;
    
  }



  public int aggressiveCows(int arr[],int cows)
  {
    int n = arr.length;
    Arrays.sort(arr);
    int low = 1;
    int high = arr[n-1] - arr[0];
    while(low <= high)
    {
      int mid = low + (high - low) / 2;
      if(isPossible(arr, mid, cows))
      {
        low = mid + 1;
      }
      else
      high = mid - 1;
    }

  }





  public static void main(String args[])
  {
    int[] stalls = {0, 3, 4, 7, 10, 9};
    int k = 4;
    int ans = aggressiveCows(stalls, k);
    System.out.println("The maximum possible minimum distance is: " + ans);
  }
  
}
