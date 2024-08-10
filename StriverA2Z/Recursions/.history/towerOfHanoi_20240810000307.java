import java.util.*;
public class towerOfHanoi {
  
  static void towerOfHanoii(int n, String src, String help, String dest)
  {
    if(n == 1)
    {
      System.out.println("Transfer " + n +" from " + src +" to "+ dest);
      return;
    }
    towerOfHanoii(n, src, dest, help);
    System.out.println("Transfer " + n +" from " + src +" to "+ dest);
    towerOfHanoii(n, dest, help, src);

  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

   towerOfHanoii(n,"3","2","1");
    sc.close();
  }
  
  


}
