class Demo
{
  public static void main(String a[])
  {
    int i=0;
    int j=0;
    try{
      j = 18 / i;
      
    }
    catch(ArithmeticException e)
    {
      
    }



    catch(Exception e)
    {
      System.out.println("Something went wrong!");
    }
  }
}