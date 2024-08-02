import java.util.*;
public class swapRecursion {


  void swap(int a,int b)
  {
    if(a == b)
    {
      return;
    }
    else
    {
      int temp = a;
      a = b;
      b = temp;
    }
  }

  void reverseArray(int i,ArrayList <Integer> arr,int no)
  {
    if(i>no)
    return;

    else
    {
      swap(arr.get(i),arr.get(no-i-1));
      reverseArray(i+1,arr,no);

      
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
    int i=0;
    int no=arr.size();
    reverseArray(i,arr,no);

    sc.close();
  }
  
}
