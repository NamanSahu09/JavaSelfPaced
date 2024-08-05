import java.util.*;
public class clearBits {
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int no = sc.nextInt();
  System.out.println("Enter position number: ");
  int pos = sc.nextInt();
  
  int bitMask = 1 << pos;
    int notBitMask = ~(bitMask)
  int newNumber = bitMask & no;
  System.out.println("New number is: " + newNumber); 


  sc.close();
  }
}
