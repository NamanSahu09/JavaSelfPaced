import java.util.*;
public class setBits {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int no = sc.nextInt();
  System.out.println("Enter position number: ");
  int pos = sc.nextInt();
  
  int bitMask = 1 << pos;

  if((bitMask  no) == 0 )
  {
    System.out.println("Bit was ZERO");
  }
  else
  System.out.println("Bit was ONE");


  sc.close();
  }
}
