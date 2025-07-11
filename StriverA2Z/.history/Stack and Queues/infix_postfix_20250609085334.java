import java.util.*;
class infix_postfix
{
  public static int priority(char ch)
  {
    if (ch == '+' || ch == '-') {
      return 1;
    } else if (ch == '*' || ch == '/') {
      return 2;
    } else if (ch == '^') {
      return 3;
    }
    return -1; 
  }

  public static String infixPostfix(String s)
  {
    Stack<Character> st = new Stack<>();
    StringBuilder result = new StringBuilder();


    int l = s.length();
    while(l-- > 0)
    {
      char c = s.charAt(l);
      if((c >= 'A' && c <='Z') || (c >='a' && c<='z') || (c>=0 && c<=9))
      {
        result.append(c);
      }
      else if(c == '(')
      {
        st.push(c);
      }
      else if(c == ')')
      {
        while(!st.isEmpty() && st.peek() != '(')
        {
          result.append(st.pop());
          st.pop();
        }
      }
      else
      {
        while(!st.isEmpt)
      }




      }
    }

  }



}