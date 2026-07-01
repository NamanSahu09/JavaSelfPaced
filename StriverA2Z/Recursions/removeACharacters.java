import java.util.*;
public class removeACharacters 
{
  // using recursion 
  //bccadad
  //remove the a char from the string okauy
  
  public String skipA(String s, String res)
  {
    // bccdd
    if(s == " ")
    {
      return res;
    }
    char ch = s.charAt(0);
    if(ch == 'a' || ch == 'A')
    {
      return skipA((s.substring(1)), res);
    }
    else
    {
      return skipA(s.substring(1), res);
    }
    
  }


  public static void main(String args[])
  {

    removeACharacters obj = new removeACharacters();
    String s = "bccaekad";
    System.out.println(obj.skipA(s,""));


  }
  
}
