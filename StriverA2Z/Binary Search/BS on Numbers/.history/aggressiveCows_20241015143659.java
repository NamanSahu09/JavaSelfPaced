import java.util.*;
public class aggressiveCows
{
  public static boolean isPossible(int arr[], int dist, int cows)
  {
    int n = arr.length;
    int cnt = 1;
    int last = arr[0];
    for(int i=1; i<n; i++)
    {
      if(arr[i] - last >= dist)
      {
        cnt++;
        last = arr[i];
        if(cnt == cows)
        return true;
      }
    }
    return false;
  }

  public static int aggressiveCows(int arr[],int cows)
  {
    int n = arr.length;
    Arrays.sort(arr);
    int low = 1;
    int res = 0;
    int high = arr[n-1] - arr[0];
    while(low <= high)
    {
      int mid = low + (high - low) / 2;
      if(isPossible(arr, mid, cows))
      {
        low = mid + 1;
        res = mid;
      }
      else
      high = mid - 1;
    }
    return res;

  }

  public static void main(String args[])
  {
    int[] stalls = {0, 3, 4, 7, 10, 9};
    int k = 4;
    int ans = aggressiveCows(stalls, k);
    System.out.println("The maximum possible minimum distance is: " + ans);
  }
  
}
