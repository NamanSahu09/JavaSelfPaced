import java.util.*;

class infix_postfix {
    public static int priority(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        }
        return -1;
    }

    public static String infixPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) 
        { 
            char c = s.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) 
            {
                result.append(c);
            } else if (c == '(') 
            {
                st.push(c);
            } 
            else if (c == ')') 
            {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); 
            } 
            else 
            {
                while (!st.isEmpty() && priority(st.peek()) >= priority(c)) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        String s = sc.nextLine();
        String postfix = infixPostfix(s);
        System.out.println("Postfix expression: " + postfix);
    }
}
