package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class digitSum {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    HashMap<Character,Integer> map = new HashMap<>();
    int a = 65;
    for(int i=1;i<=26;i++)
    {
      map.put((char)a, i);
      a++;
    }
    // for(Map.Entry<Character,Integer> entry : map.entrySet())
    // {
    //   System.out.println(entry.getKey()+"->"+entry.getValue());
      
    // }

    //Sum;
    System.out.println("Enter a string: ");
    String st = sc.nextLine();
    int sum=0;
    System.out.println("Enter K value: ");
    int k = sc.nextInt();
    while(k!=1)
    {
    for(int i = 0 ;i < st.length();i++)
    {
      char ch = st.charAt(i);
      if(map.containsKey(ch))
      {
        int store = map.get(ch);
        if(store > 9)
        {
          while(store != 0)
          {
            sum=sum+store%10;
            store = store/10;
          }
        }
        sum = sum + store;
      }
      
    }
    st = Integer.toString(sum);
    k--;
  }
    System.out.println(sum);


  }
  
}
