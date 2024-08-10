import java.util.*;
public class towerOfHanoi {
  
  static void towerOfHanoii(int n, String src, String help, String dest)
  {
    if(n == 1)
    {
      System.out.println("Transfer " + n +" from " + src +" to "+ dest);
      return;
    }
    towerOfHanoii(n-1, src, dest, help);
    System.out.println("Transfer " + n +" from " + src +" to "+ dest);
    towerOfHanoii(n-1, dest, src,help );

  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

   towerOfHanoii(n,"S","H","D");
    sc.close();
  }
  
  


}
