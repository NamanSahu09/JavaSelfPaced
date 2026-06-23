//count good numbers 
import java.util.Scanner;

class countGoodNumbers1 {
  public int countGoodNumbers(long n) 
  {
      long MOD = 1000000007;
      
      //evenPow formula (n+1)/2
      long even = (n+1)/2;
      long odd = n/2;

      long evenPow = powers(5,even,MOD);
      long oddPow = powers(4,odd,MOD);
      return (int)((evenPow*oddPow) % MOD);  
  }
  long powers(long base, long exp, long MOD)
  {
      //base case 
      if(exp == 0) return 1;

      long halfPow = powers(base,exp/2,MOD);

      if(exp % 2 == 0)
      {
          return (halfPow * halfPow) % MOD;
      }
      else
      return (base * (halfPow * halfPow)) % MOD;
  }

  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();

      countGoodNumbers1 obj = new countGoodNumbers1();
      System.out.println(obj.countGoodNumbers(n));

      sc.close();
  }
}
