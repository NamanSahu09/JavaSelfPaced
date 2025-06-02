import java.util.*;

public class validParenthesis 
{
  public boolean isValid(String s) 
  {
      Stack<Character> st = new Stack<>();

      for(char c : s.toCharArray())
      {
          if(c == '[' || c == '{' || c == '(')
          st.push(c);
          else
          {
              if(st.isEmpty())
              {
                  return false;
              }
              char ch = st.pop();
              if((c == ')' && ch != '(') || (c == ']' && ch != '[') || (c == '}' && ch != '{')) 
              return false;
          }
          
      }

         return st.isEmpty();
  }
  public static void main(String args[])
  {
    validParenthesis vp = new validParenthesis();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string of parentheses:");
    String input = sc.nextLine();
    
    if(vp.isValid(input))
    {
      System.out.println("The parentheses are valid.");
    }
    else
    {
      System.out.println("The parentheses are not valid.");
    }
  }
}
