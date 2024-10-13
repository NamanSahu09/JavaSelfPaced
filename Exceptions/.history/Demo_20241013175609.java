class A 
{
  public void show()
  {
    Class.forName("Demo");
  }
}




public class Demo
{
  public static void main(String a[])
  {
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
  }
}