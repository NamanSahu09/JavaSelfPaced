import java.util.*;
class MaximumDepthOfParenthesis 
{
  public int getDepth(String s)
  {
    int maxDepth = 0;
    int currentDepth = 0;
    for(int i=0; i<s.length(); i++)
    {
      char c = s.charAt(i);
      if(c == '(')
        currentDepth++;
      else if(c == ')')
      {
        currentDepth--;
        maxDepth = Math.max(maxDepth, currentDepth);
      }
    }
    return maxDepth;
  }
  public static void main(String[] args)
  {
    String s = "(1*(2*3)+((8)/4))+1";
    System.out.println(getDepth(s));
  }
}