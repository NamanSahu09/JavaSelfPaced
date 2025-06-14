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

  public static String infixTo



}