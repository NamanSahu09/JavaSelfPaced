import java.util.*;

@FunctionalInterface
interface A
{
  void show();
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

  }
}