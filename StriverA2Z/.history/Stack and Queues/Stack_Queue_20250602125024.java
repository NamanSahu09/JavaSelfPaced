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
  void pop()
  {
    if(top == -1)
    {
      System.out.println("Stack is empty");
    }
    else
    {
      System.out.println("Popped element: " + stack[top]);
      top--;
    }
  }

  void display()
  {
    if(top == -1)
    {
      System.out.println("Stack is empty");
    }
    else
    {
      System.out.print("Stack elements: ");
      for(int i = 0; i <= top; i++)
      {
        System.out.print(stack[i] + " ");
      }
      System.out.println();
    }
  }
}

class Queue
{
  int front = -1;
  int rear = -1;
  int queue[];
  Queue(int size)
  {
    queue = new int[size];
  }
  void enqueue()
  {
    if(rear == -1 || rear < queue.length - 1)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the element to be enqueued:");
      int element = sc.nextInt();
      if(front == -1) 
      front = 0;

      rear++;
      queue[rear] = element;

    }
    else
    {
      System.out.println("Queue is full");
    }
  }
  void dequeue()
  {
    if(front == -1 || front > rear)
    {
      System.out.println("Queue is empty");
    }
    else
    {
      System.out.println("Dequeued element: " + queue[front]);
      front++;
    }
  }
}








public class Stack_Queue
 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the stack:");
    int size = sc.nextInt();
    Queue queue = new Queue(size);
    
    while(true)
    {
      System.out.println("1. Push\n2. Pop\n3. Display \n4. Exit");
      int choice = sc.nextInt();
      switch(choice)
      {
        case 1:
          queue.push();
          break;
        case 2:
        queue.pop();
          break;
        case 3:
          stack.display();
          break;
        case 4:
         System.exit(0);
         break;  
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}