package JavaSelfPaced.StriverA2Z.Basic_Maths;
import java.util.Scanner;
public class reverseNumber {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int no = sc.nextInt();

    int rev=0,k=0;
    while(no>0)
    {
      rev = k * 10 + no % 10;
      no = no / 10;
    }
    

    System.out.println(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ? "0" : rev);


  }
   
}
