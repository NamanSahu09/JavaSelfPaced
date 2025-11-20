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

    //Now parameterised
    



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
  }



}
