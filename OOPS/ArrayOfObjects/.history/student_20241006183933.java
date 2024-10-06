import java.util.*;

class details
{
    String name;
    int age;
    int rollNo;
    String clas;

    public details(String st,int age,int roll,String classs)
    {
      name = st;
      this.age = age;
      rollNo = roll;
      clas = classs;
    }


}
public class student 
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);


    System.out.println("enter Number of students ");
    int n = sc.nextInt();
    Details obj[] = new Details[n];

    for(int i=0;i<n;i++)
    {
      System.out.println("Enter name of student: ");
      String st = sc.next();
      System.out.println("Enter age of student: ");
      int ag = sc.nextInt();
      
    }


  }
  
}
