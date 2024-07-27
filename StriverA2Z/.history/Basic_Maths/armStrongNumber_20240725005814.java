package Basic_Maths;

import java.util.*;
public class armStrongNumber {

  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter a number ");
    int num = sc.nextInt();
    int originalNum = num;
    int rem=0,sum=0;
    while(num !=0)
    {
      rem = num%10;
      sum = sum + Math.pow(rem,3);

    }
  
  
  
  }
}
