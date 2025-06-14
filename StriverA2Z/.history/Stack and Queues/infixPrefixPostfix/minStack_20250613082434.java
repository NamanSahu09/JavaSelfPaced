package infixPrefixPostfix;
import java.util.Stack;
import java.util.*;
class Pair 
{
  int x, y;
  Pair(int x, int y) {
      this.x = x;
      this.y = y;
  }
}
class MinStack 
{
  Stack < Pair > st;
  public MinStack() {
      st = new Stack < > ();
  }

  public void push(int x) {
      int min;
      if (st.isEmpty()) {
          min = x;
      } else {
          min = Math.min(st.peek().y, x);
      }
      st.push(new Pair(x, min));
  }

  public void pop() {
      st.pop();
  }

  public int top() {
      return st.peek().x;
  }

  public int getMin() {
      return st.peek().y;
  }

  public static void main(String args[])
  {
    MinStack minStack = new MinStack();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of operations:");
    int n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        System.out.println("Enter operation (push <value>, pop, top, getMin):");
        String operation = sc.next();
        
        if (operation.equals("push")) {
            int value = sc.nextInt();
            minStack.push(value);
            System.out.println("Pushed: " + value);
        } else if (operation.equals("pop")) {
            minStack.pop();
            System.out.println("Popped");
        } else if (operation.equals("top")) {
            System.out.println("Top: " + minStack.top());
        } else if (operation.equals("getMin")) {
            System.out.println("Min: " + minStack.getMin());
        } else {
            System.out.println("Invalid operation");
        }
    }
    sc.close();
  }



}