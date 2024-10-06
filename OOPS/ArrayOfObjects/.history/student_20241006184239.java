import java.util.*;

class details
{
    String name;
    int age;
    int rollNo;
    String clas;

    // public details(String st,int age,int roll,String classs)
    // {
    //   name = st;
    //   this.age = age;
    //   rollNo = roll;
    //   clas = classs;
    // }


}
public class student 
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);


    System.out.println("enter Number of students ");
    int n = sc.nextInt();
    details obj[] = new details[n];

    for(int i=0;i<n;i++)
    {
      System.out.println("Enter name of student: ");
      String st = sc.next();
      System.out.println("Enter age of student: ");
      int ag = sc.nextInt();
      System.out.println("Enter roll number of student: ");
      int ro = sc.nextInt();
      System.out.println("Enter class of student: ");
      String cl = sc.next();
      obj[i].name = st;
      obj[i].age = ag;
      obj[i].rollNo = ro;
      obj[i].clas = cl;

    }
    System.out.println("--------------------------------------------")
    for(int i=0;i<n;i++)
    {
      System.out.println("Name: "+obj[i].name);
      System.out.println("Age: "+obj[i].age);
      System.out.println("Roll number: "+obj[i].rollNo);
      System.out.println("Class: "+obj[i].clas);
      System.out.println("----------------------------------");
    }

  }
  
}
