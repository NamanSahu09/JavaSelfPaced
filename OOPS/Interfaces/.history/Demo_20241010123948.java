
interface Computer
{
  void code();
}
class Laptop implements Computer
{
  public void code()
  {
    System.out.println("CODE, Compile, RUN");
  }
}
class Desktop implements Computer
{
  public void code()
  {
    System.out.println("CODE, COMPILE, RUN, TEST");
  }
}

public class Demo
{
  public static void main(String args[])
  {
    Desktop.Laptop lap = (Desktop) new Laptop();
    lap.code();



  }
  
}
