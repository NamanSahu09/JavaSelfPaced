import java.time.chrono.Era;
import java.util.*;

@FunctionalInterface
interface A
{
  void show();
}

abstract class B
{
  int a = 20;
  abstract void display();
 
}

class c extends B
{
  void display()
  {
    System.out.println("Concrete class implementation");
  }
  
}

class e implements A
{
  public void show()
  {
    System.out.println("Implementation of show() in interface");
  }
}

class demo
{
  public static void main(String args[])
  {
    A obj = new A() {
      public void show() {
        System.out.println("Anonymous class implementation");
      }
      };
      obj.show();

      E obj = new E();
      
      

  }
}