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
  public void show() {
    System.out.println("Abstract class implementation");
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

  }
}