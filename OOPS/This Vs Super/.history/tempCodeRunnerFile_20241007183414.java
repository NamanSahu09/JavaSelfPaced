class A {
  // No-argument constructor of class A
  public A() 
  {
      super();  // Calls the constructor of Object class (implicitly done, so can be omitted)
      System.out.println("A's constructor");
  }

  // Parameterized constructor of class A
  public A(int n) {
      super();  // Calls the constructor of Object class (implicitly done, so can be omitted)
      System.out.println("A's parameterized constructor");
  }
}

class B extends A {
  // No-argument constructor of class B
  public B() 
  {
      super();
      System.out.println("B's constructor");
  }

  // Parameterized constructor of class B
  public B(int n) 
  {
      super(n);  
      System.out.println("B's parameterized constructor");
  }
}

// Multilevel inheritance
public class Demo 
{
  public static void main(String[] args) 
  {
      B obj = new B(5);  
  }
}
