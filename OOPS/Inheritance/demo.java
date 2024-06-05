package JavaSelfPaced.OOPS.Inheritance;

public class demo 
{
   public static void main(String[] args)
   {
      Car obj = new Car();
      Bike obj1 = new Bike();
      obj.go();
      obj1.stop();
   }
}

class Vehicle
{
double speed = 40.0;
void go()
{
  System.out.println("Starting up ...");
}
void stop()
{
  System.out.println("Stopping the Vehicle...");
}  
}

class Car extends Vehicle
{
  int wheels =4;
  int doors = 4;
}
class Bike extends Vehicle
{
int wheels = 2;
int pedals = 2;
}
