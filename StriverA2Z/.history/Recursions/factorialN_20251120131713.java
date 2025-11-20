import java.util.*;
public class factorialN 
{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find its factorial: ");
    int n = sc.nextInt();
    //Functional Approach
    System.out.println("Factorial of " + n + " is: " + factorial(n));
    System.out.println("\nNow using parameterised approach: \n");

    //Now parameterised
    fact(n,1);
    System.out.println("------------------------");
    
        
    
    
    
      }
      private static void println(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'println'");
      }
      static int factorial(int n)
  {
    if(n == 0)
    {
      return 1;
    }
    return n * factorial(n-1);
  }
   
  static void fact(int i,int f)
  {
    if(i == 0)
    {
      System.out.println("Factorial is: " + f);
      return ;
    }
    fact(i-1, f*i);
  }



}
