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
    int k =0;
    int c=0;
    for(int i=0;i<st.length;i++)
    {
      String s = st[i];
      for(int j=0; j<s.length();j++)
      {
        char ch = s.charAt(i);
        if(!map.containsKey(ch))
        {
          k = 1;
          break;
        }
      }
      if(k==0)
      c++;
      k=0;
    }
    
    System.out.println(c);
  
  
  }

  
}