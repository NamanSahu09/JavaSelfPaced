import java.util.*;
public class fiboEasy {
  static void fibo(int a , int b, int n)
  {
    if(n == 0)
    return;
    
  }



  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total number of terms ");
    int no = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a);
    System.out.println(b);


   fibo(a,b,no-2);
    
    sc.close();
  }



}

