package String;

import java.util.HashMap;

public class consistentStrings
{
  public static void main(String args[])
  {
    String st[] = {"ad","bd","aaab","baa","badab"};
    String search = "ab";


    HashMap<Character,Boolean> map = new HashMap<>();

    for(int i=0;i<search.length();i++)
    {
      char ch = search.charAt(i);
      if(!map.containsKey(ch))
      map.put(ch,true);
    }
    int flag =0;

    
  
  
  
  }

  
}
