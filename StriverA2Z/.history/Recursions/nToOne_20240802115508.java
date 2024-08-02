import java.util.Scanner;

public class nToOne 
{
   void nToOne(int no)
  {
    if(no < 1)
    return;

    System.out.print(no+" ");

    nToOne(no-1);
    
  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int n = sc.nextInt();
    
    nToOne(n);
    sc.close();
  
  }
  
}
