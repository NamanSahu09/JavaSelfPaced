import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A 
{
  public void show()throws ClassNotFoundException
  {
    // try{
    // Class.forName("Add");
    // }
    // catch(Exception e)
    // {
    //   System.out.println("Class not found: " + e.getMessage());
    // }
    Class.forName("Add");
  }
}




public class Demo
{
  public static void main(String a[])throws ClassNotFoundException, IOException
  {
      A obj = new A();
      obj.show();

    //Displays the stack of e
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //int i=0;
    int i = 20;
    int j=0;
    try{
      j = 18 / i;
      if(j == 0)
      throw new ArithmeticException();
      
    }
    catch(ArithmeticException e)
    {
      System.out.println("Arithmetic Exception: Division by zero");
    }
    catch(Exception e)
    {
      System.out.println("Something went wrong!");
    }


    try
    {
      j = 18 / i;
      System.out.println("Hi");
    }
    catch(Exception e)
    {
      System.out.println("Something is wrong.");
    }
    finally
    {
      System.out.println("This will always be executed.");
      br.close();//Always close it
      //everything is closed in finally block
    }



  }
}