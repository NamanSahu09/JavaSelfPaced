import java.util.*;
public class factorialN 
{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find its factorial: ");
    int n = sc.nextInt();
    System.out.println("Factorial of " + n + " is: " + factorial(n));
  }
  static int factorial(int n)
  {
    if(n == 0)
    {
      return 1;
    }
    return n * factorial(n-1);
  }
  
}
