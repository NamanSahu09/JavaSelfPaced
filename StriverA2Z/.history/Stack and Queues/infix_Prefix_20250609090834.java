import java.util.*;
class infix_Prefix
{
  //1. Reverse the infix
  //2. Convert to postfix
  //3. Reverse the postfix to get prefix

  static int priority(char ch)
  {
    if(ch == '+' || ch == '-')
    {
      return 1;
    }
    else if(ch == '*' || ch == '/')
    {
      return 2;
    }
    else if(ch == '^')
    {
      return 3;
    }
  }


  public static String infixPrefix(String s)
  {
    StringBuilder sb = new StringBuilder(s);
    
  }





}
