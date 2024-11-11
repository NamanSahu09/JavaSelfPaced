package Easy;

import java.util.HashMap;

public class ISOMORPHIC {
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length())
        return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ori = s.charAt(i);
            char rep = t.charAt(i);

            if(!map.containsKey(ori))
            {
                if(!map.containsValue(rep))
                {
                    map.put(ori,rep);
                }
                else
                return false;
            }
            else
            {
                char temp = map.get(ori);
                if(temp != rep)
                return false;
            }
        }
        return true;
        
    }
    
}
  

