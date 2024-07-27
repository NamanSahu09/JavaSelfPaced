package Basic_Maths;

import java.util.Scanner;
import java.util.ArrayList;
public class factors {
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a number you want to see the factors");
     int no=sc.nextInt();
      // for(int i=1;i<=no;i++)
      // {
      //   if(no%i == 0)
      //   System.out.print(i+",");
      // }

      double no1 = Math.sqrt(no);
      ArrayList <Integer> store = new ArrayList <>();
      for(int i =1;i<=no1;i++)
      {
        if(no1%i==0)
        {
          store.add(i);
          if()


        }


      }




      sc.close();
  }
}
