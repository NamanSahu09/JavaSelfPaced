import java.util.*;
public class trappingRainWater 
{
  static int trap(int arr[])
  {
    int lMax = 0, rMax = 0, total = 0;
    int l = 0, r = arr.length - 1;
    while(l < r)
    {
      if(arr[l] < arr[r])
      {
        if(lMax > arr[l])
        {
          total += lMax - arr[l];
        }
        else
        {
          lMax = arr[l];
        }
        l++;
      }
      else
      {
        if(rMax > arr[r])
        {
          total += rMax - arr[r];
        }
        else
        {
          rMax = arr[r];
        }
        r--;
      }
      return total;
    }
  }
  public static void main(String args[])
  {
    trappingRainWater trw = new trappingRainWater();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int result = trw.trap(arr);
    System.out.println("Total trapped rainwater: " + result);
    sc.close();
    System.out.println("Program completed successfully.");
  }
  
}
