public class swap2no {
 

  public static void main(String args[])
  {
    int a = 10;
    int b = 20;
   
    a =a^b;
    b = a^b; // (a^b)^b = a
    a = a^b; // a^(a^b) = b
    
  }

  
}
