import java.util.*;
public class trappingRainWater 
{
  public int trap(int arr[])
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
    }
  }
  
}
