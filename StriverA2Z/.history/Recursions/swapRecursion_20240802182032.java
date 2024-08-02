import java.util.*;
public class swapRecursion {


  int swap(int a,int b)
  {
    if(a == b)
    {
      return 0;
    }
    else
    {
      int temp = a;
      a = b;
      b = temp;
      return (a,b);
    }
  }







  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    ArrayList <Integer> arr = new ArrayList<>();

    while(true)
    {
      System.out.println("Enter element");
      int num = sc.nextInt();
      arr.add(num);
      System.out.println("Do you want to add more elements? (yes/no)");
      String choice = sc.next();
      if(choice.equalsIgnoreCase("no"))
      {
        break;
      }
    }
    System.out.println("Array is ");
    for(int i: arr)
    {
      System.out.print(i + " ");
    }


    sc.close();
  }
  
}
