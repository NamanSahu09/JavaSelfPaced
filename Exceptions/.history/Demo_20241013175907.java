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
  public static void main(String a[])
  {
      A obj = new A();
      try {
        obj.show();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }



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