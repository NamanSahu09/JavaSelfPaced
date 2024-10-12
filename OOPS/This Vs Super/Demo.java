
public class A 
{
public A()
{
  super();
  System.out.println("A's constructor");
}
public A(int n)
{
  super();
  System.out.println("A's parameterized constructor");
 
}

}
public class B extends A
{
  public B()
  {
    super();
    System.out.println("B's constructor");
  }
  public B(int n)
  {
    super();
    this();
    System.out.println("B's parameterized constructor");
  }

}
//multilevel inheritance

public class Demo 
{
  public static void main(String[] args)
  {
    B obj = new B();
  }
  
}
