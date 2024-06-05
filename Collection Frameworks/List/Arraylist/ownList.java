import java.util.ArrayList;
import java.util.Iterator;
public class ownList 
{
  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(1,15);

    // for(int i=0;i<list.size();i++)
    // {
    //   System.out.print(list.get(i));
    // }

   for(Integer element : list)
   {
    System.out.print(element + ",");
   }

   ArrayList <Integer> newList = new ArrayList<>();
   
   newList.add(150);
   newList.add(200);
   list.addAll(newList);
   System.out.println();
   for(Integer element : list)
   {
    System.out.print(element + ",");
   }
   Iterator <Integer> it = list.iterator();
   System.out.println("\nIterator Example");
   while(it.hasNext())
   {
    System.out.print(it.next() + " ");    
   }


   
   list.remove(Integer.valueOf(10));
   list.set(2,35);
   System.out.println(list.contains(15));
   System.out.println();
   for (Integer element : list) {
    System.out.print(element + ",");
}
  
  
  
  }
}
