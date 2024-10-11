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

    for(int i=0;i<st.length;i++)
    {
      String s = st[i];
      for(int j=0; j<st.length;j++)
      {
        char c = s.charAt(i);
        if(!map.contains)
      }
    }
  
  
  
  }

  
}
