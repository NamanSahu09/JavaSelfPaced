  import java.util.Scanner;
  import java.util.HashSet;
  import java.util.Iterator;
  public class hashSet
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of elements you want to insert into Hash Set");
      int no = sc.nextInt();
  
      //create
      HashSet<Integer>set = new HashSet<>();
      
  
      for(int i=0;i<no;i++)
      {
        System.out.print("Enter element: ");
        int temp = sc.nextInt();
        set.add(temp);
      }
      //Set display
      Iterator it = set.iterator();
      while(it.hasNext())
      {
        System.out.print(it.next()+" ");
      }
      //Search
      System.out.println("Enter a number you want to search in Set");
      int n = sc.nextInt();
      if(set.contains(n))
      System.out.println("Yes it contains" + n);
      
      sc.close();
    }
  }
