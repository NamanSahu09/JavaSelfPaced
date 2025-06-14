import java.util.*;
class infix_Prefix
{
  //1. Reverse the infix
  //2. Convert to postfix
  //3. Reverse the postfix to get prefix

  static int priority(char ch)
  {
    if (condition(ch, '+', '-')) {
      return 1;
    } else if (condition(ch, '*', '/')) {
      return 2;
    } else if (condition(ch, '^')) {
      return 3;
  }



}
