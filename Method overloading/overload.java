import java.util.*;
public class overload
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.print("Sum of two number is : " + add(a,b) + "\n");
    System.out.print("Sum of three number is : " + add(a,b,c));
  }
  static int add(int a , int b)
  {
    return a+b;
  }
  static int add(int a,int b, int c)
  {
    return a+b+c;
  }
}