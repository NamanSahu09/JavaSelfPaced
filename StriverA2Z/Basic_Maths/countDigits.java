package JavaSelfPaced.StriverA2Z.Basic_Maths;
import java.util.Scanner;
public class countDigits 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number ");
    int no = sc.nextInt();

    int count = (int) Math.log10(no) + 1;
    System.out.println(count);



  }
  
}
