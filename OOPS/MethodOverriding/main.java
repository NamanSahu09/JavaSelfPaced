package JavaSelfPaced.OOPS.MethodOverriding;

public class main 
{
  public static void main(String args[])
  {
    Dog dog = new Dog();
    dog.speak();
    Animal animal = new Animal();
    animal.speak();
  }
  
}

class Animal
{
  
  void speak()
  {
    System.out.println("The animal Speaks...");
  }

}

class Dog extends Animal
{

  @Override
  void speak()
  {
    System.out.println("Dog is barking...");
  }

}