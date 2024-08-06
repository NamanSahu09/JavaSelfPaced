import java.util.*;
public class Factorial {
  
  static int calcFact(int n)
  {
    if(n == 1 || n == 0)
    return 1;

    int fact_mn = calcFact(n-1);
    int fact_res = n * fact_mn;

  }





  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

    int ans  = calcFact(n);
    System.out.println("Factorial is: " + ans);

    sc.close();
  }
  
  


}
