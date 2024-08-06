// import java.util.*;
// public class fibonacci {
  
//   static int fibo(int n)
//   {
//     if(n <= 1)
//     return n;
//     System.out.print("Last: ");
//     System.out.print(n+" ");
//     int last = fibo(n-1);
//     System.out.println();
//     System.out.print("Second LAST: ");
//     System.out.print(n+" ");
//     int slast = fibo(n-2);
//     return last + slast;
//     // return fibo(n-1) + fibo(n-2);
//   }



//   public static void main(String args[])
//   {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter total number of terms ");
//     int no = sc.nextInt();
//     int res = fibo(no);
//     System.out.print("Answer: "+ res);
//     sc.close();
//   }



// }
import java.util.*;

public class fibonacci {
  
  static int fibo(int n) {
    // Print the current value of n at the start of each call
    System.out.println("Calculating fibo(" + n + ")");
    
    if (n <= 1) {
      System.out.println("Reached base case, returning " + n);
      return n;
    }
    
    System.out.println("Calculating fibo(" + (n - 1) + ") + fibo(" + (n - 2) + ")");
    
    int last = fibo(n - 1);
    System.out.println("Result of fibo(" + (n - 1) + "): " + last);
    
    int slast = fibo(n - 2);
    System.out.println("Result of fibo(" + (n - 2) + "): " + slast);
    
    int result = last + slast;
    System.out.println("Sum of fibo(" + (n - 1) + ") and fibo(" + (n - 2) + "): " + result);
    
    return result;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total number of terms: ");
    int no = sc.nextInt();
    
    int res = fibo(no);
    System.out.println("Answer: " + res);
    
    sc.close();
  }
}

