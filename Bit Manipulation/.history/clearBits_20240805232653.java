import java.util.*;
public class clearBits {4
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int no = sc.nextInt();
  System.out.println("Enter position number: ");
  int pos = sc.nextInt();
  
  int bitMask = 1 << pos;

  int newNumber = bitMask | no;
  System.out.println("New number is: " + newNumber); 


  sc.close();
  }
}
