import java.util.*;
public class fibonacci {
  
  static int fibo(int n)
  {
    if(n <= 1)
    return n;
    System.out.print(n)
    int last = fibo(n-1);
    int slast = fibo(n-2);
    return last + slast;
    // return fibo(n-1) + fibo(n-2);
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
