package JavaSelfPaced.OOPS.abstracttclass;

public class demo
{
  public static void main(String args[])
  {
    //abstract = abstract classes cannot be instantiated, but they can have         subclass 
    //           abstract methods are declared without an implementation
      //Vehicle vehicle = new Vehicle();
      Car car = new Car();
      //Adding abstact to a class adds a security 

      car.go();


  
  
  }
  
}
 
abstract class Vehicle
{
  //adding abstract we can no longer create a object of this class

  abstract void go();
  //abstract methods dont allow you to create a body.


}
 class Car extends Vehicle
{
  @Override
  void go()
  {
    System.out.println("Car is moving");
  }
}