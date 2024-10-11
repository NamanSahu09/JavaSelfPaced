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
      map.put(ch,true);
    }
   
    int c=0;
    for(int i=0;i<st.length;i++)
    {
      String s = st[i];
      boolean k = true;
      for(int j=0; j<s.length();j++)
      {
        char ch = s.charAt(i);
        if(!map.containsKey(ch))
        {
          k = false;
          break;
        }
      }
      if(k)
      c++;
      k=0;
    }
    
    System.out.println(c);
  
  
  }

  
}
