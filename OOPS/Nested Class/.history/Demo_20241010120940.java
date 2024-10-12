class A 
{
  int age;
  public void show()
  {
    System.out.println("I am in A class. ");
  }

  class B
  {
    public void config()
    {
      System.out.println("I am in the class B.");

    }
  }
  
}

class Demo
{
  public static void main(String args[])
  {
    A obj = new A();
    obj.show();

    A.B obj1 = obj.new B();
    obj1.config();
  }
}