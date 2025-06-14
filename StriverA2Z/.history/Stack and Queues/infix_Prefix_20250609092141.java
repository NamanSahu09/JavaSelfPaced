import java.util.*;
class infix_Prefix
{
  //1. Reverse the infix
  //2. Convert to postfix
  //3. Reverse the postfix to get prefix
 
      public static int priority(char ch) {
          if (ch == '+' || ch == '-') return 1;
          else if (ch == '*' || ch == '/') return 2;
          else if (ch == '^') return 3;
          return -1; // Fixed return
      }
  
      public static String infixPrefix(String s) {
          Stack<Character> st = new Stack<>();
          StringBuilder sb = new StringBuilder();
  
          // Reverse + Bracket swap
          StringBuilder input = new StringBuilder(s).reverse();
          StringBuilder processed = new StringBuilder();
          for (char c : input.toString().toCharArray()) {
              if (c == '(') processed.append(')');
              else if (c == ')') processed.append('(');
              else processed.append(c);
          }
          s = processed.toString();
  
          for (int i = 0; i < s.length(); i++) {
              char c = s.charAt(i);
              if (Character.isLetterOrDigit(c)) {
                  sb.append(c);
              } else if (c == ')') {
                  st.push(c);
              } else if (c == '(') {
                  while (!st.isEmpty() && st.peek() != ')') {
                      sb.append(st.pop());
                  }
                  st.pop();
              } else {
                  // Fixed precedence check for right associativity
                  while (!st.isEmpty() && 
                      (priority(st.peek()) > priority(c) || 
                      (priority(st.peek()) == priority(c) && c != '^'))) {
                      sb.append(st.pop());
                  }
                  st.push(c);
              }
          }
  
          while (!st.isEmpty()) {
              sb.append(st.pop());
          }
          return sb.reverse().toString();
      }
  
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter infix expression:");
          String exp = sc.nextLine();
          System.out.println("Prefix: " + infixPrefix(exp));
      }
  }
  