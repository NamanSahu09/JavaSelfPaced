import java.util.*;
class Stackk
{
  int top;
  int stack[];
  Stackk(int size)
  {
    top = -1;
    stack = new int[size];
  }
  void push()
  {
    if(top == -1 || top < stack.length -1)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the element to be pushed:");
      int element = sc.nextInt();
      top++;
      stack[top] = element;
    }
    else
    {
      System.out.println("Stack is full");
    }
    
  }
  void 
}


class Main
{
  public static void main(String args[])
  {
    //w
  }
}