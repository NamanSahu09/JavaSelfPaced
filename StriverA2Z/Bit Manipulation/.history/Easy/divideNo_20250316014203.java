
import java.util.Scanner;
public class divideNo
{
  public static void main(String args[])
  {
    class Solution {
      public int divide(int dividend, int divisor) 
      {
          boolean sign = true;
          if(dividend < 0 && divisor >=0) sign = false;
          if(dividend >= 0 && divisor < 0) sign = false;
          
          int cnt=0;
          int ans =0;
          long n = Math.abs((long) dividend); 
          long d = Math.abs((long) divisor);
          while(n >= d)
          {
              cnt = 0;
              while(n > (d << (cnt+1)))
              {
                  cnt++;
              }
              ans+= 1 << cnt;
              n-=(d << cnt);
          }
          if(sign == true && ans == (1 << 31)) return Integer.MAX_VALUE;
          if(sign == false && ans == (1 << 31)) return Integer.MIN_VALUE;
          return sign? ans:-ans;
  
  
      }
  }

  }

}