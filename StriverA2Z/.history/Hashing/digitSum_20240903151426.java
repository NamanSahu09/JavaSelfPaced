package Hashing;

import java.util.HashMap;
import java.util.Map;

public class digitSum {
  public static void main(String args[])
  {
    HashMap<Character,Integer> map = new HashMap<>();
    int a = 65;
    for(int i=1;i<=26;i++)
    {
      map.put((char)a, i);
      a++;
    }
    for(Map.Entry<Character,Integer> entry : map.entrySet())
    {
      System.out.println(entry.getKey()+"->"+entry.getValue());
      
    }

    //Sum;
    



  }
  
}
