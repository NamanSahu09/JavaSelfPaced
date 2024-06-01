package JavaSelfPaced.WrapperClass;

public class wrapper {

  public static void main(String args[]) { 
  //Provides a way to use primitive data types as reference data types.
  //Primitive : int char boolean double float
  //Reference : String... Can be used with collection , may contain some useful methods
  
  Boolean b = true;
  Integer i = 10;
  Double d = 10.5;
  Character c = 'a';

  //AutoBoxing: Directly assign a value to a wrapper class. Java compiler makes conversion between primitive and corresponding objects of wrapper class.

  //Unboxing: Reverse of auto boxing , Conversion of wrapper class to primitive
  if(c == 'a')
  System.out.println("True");

}
  
}
