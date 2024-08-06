import java.util.*;
public class fibonacci {
  
  static int fibo(int n)
  {
    if(n <= 1)
    return n;

      return (n-1) + (n-2);
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
