import java.util.*;
public class practice 
{
  static int cnt =0;
  static void display(String name)
  
  {
    if(cnt == 5)
      return;
    System.out.println(name);
    cnt++;
    display(name);
    
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    String name = sc.nextLine();
    display(name);
  }
  
}
