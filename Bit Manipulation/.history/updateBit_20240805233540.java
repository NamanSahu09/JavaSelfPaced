import java.util.*;
public class updateBit {
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int no = sc.nextInt();
  System.out.println("Enter position number: ");
  int pos = sc.nextInt();
  
  System.out.println("Enter operation 1 or 0: ");
  int oper = sc.nextInt();
  //set operation
  if(oper == 1)
  {
    //set
    int newNumber = bitMask | no;
  }
  else
  {
    //clear
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & no;
  }


  sc.close();
  }

}
