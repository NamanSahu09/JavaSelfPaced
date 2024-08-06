import java.util.*;
public class fibonacci {
  
  // static int fibo(int n)
  // {
  //   if(n <= 1)
  //   return n;
  //   // int last = fibo(n-1);
  //   // int slast = fibo(n-2);
  //   // return last + slast;
  //   return fibo(n-1) + fibo(n-2);
  // }
  static int fibo(int n) {
    // Print the current value of n at the start of each call
    System.out.println("Calling fibo(" + n + ")");

    if (n <= 1) {
      // Print when the base case is reached
      System.out.println("Base case reached: fibo(" + n + ") = " + n);
      return n;
    }

    // Print before making recursive calls
    System.out.println("Calculating: fibo(" + n + ") = fibo(" + (n - 1) + ") + fibo(" + (n - 2) + ")");
    int result = fibo(n - 1) + fibo(n - 2);

    // Print the result of the sum of the recursive calls
    System.out.println("Result of fibo(" + n + ") = " + result);

    return result;
  }


  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total number of terms ");
    int no = sc.nextInt();
    int res = fibo(no);
    System.out.print("Answer: "+ res);
    sc.close();
  }



}
