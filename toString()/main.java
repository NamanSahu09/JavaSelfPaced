public class main 
{
   public static void main(String args[])
   {
    Car car = new Car();
    System.out.println(car);
    System.out.println();
    System.out.println(car.toString());
    //Special method that all objects inherit that returns a string that "textually represents" an object. Can be used implicitely and explicitely.
   }
  
}

class Car{
  String name ="Ford";
  String model = "Mustang";
  String color = "red";
  int year = 2021;

  public String toString()
  {
  String st = name + "\n" + model + '\n' + color + '\n' + year;
  return st;
  }
}
