package Basic_Maths;

import java.util.Scanner;

public class primeNumeber {
  public static void main(String argsp[])
  {
    //Prime Number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check weather the number is prime or not: ");
    double n = sc.nextInt();

    int count =0;
    n = Math.sqrt(n);

    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        count = count + 1;
        if(n/i != i)
        {
          count = count + 1;
        }
      }
    }
    System.out.println(count == 2 ? "Prime number" : "Not a prime number");


    sc.close();
  }
}
