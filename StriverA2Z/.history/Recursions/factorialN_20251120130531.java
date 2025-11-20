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
  
}
