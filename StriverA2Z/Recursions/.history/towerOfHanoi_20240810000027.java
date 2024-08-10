import java.util.*;
public class towerOfHanoi {
  
  static void towerOfHanoii(int n)
  {
    if(n == 1 || n == 0)
    return 1;

    int res = calcFact(n-1);
    return res * n;
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
