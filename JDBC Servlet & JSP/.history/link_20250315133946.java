import java.util.*;
class link
{
  Node head = null;
  static class Node
  {
    int data ;
    Node next;

    Node(int d)
    {
      data = d;
      next = null;
    }
  }
   void addNode(int data)
  {
    Node newNode = new Node(data);
    if(head == null)
    {
      head = newNode;
      head.next = null;
      return;
    }
    else
    {
      Node ptr = head;
      while(ptr!=null)
      {
        ptr.next = newNode;
      }
      return;
    }
  }
  
  public static void main(String args[])
  {
    link obj = new link();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter total number of elements: ");
  int n = sc.nextInt();
    int j = 65;
    for(int i=0;i<n;i++)
    {
      char c = (char)j;
      System.out.println("Enter a number to insert: " + "Node " + c);
      int no = sc.nextInt();
      j++;
      addNode(no);
    }
  
  
  

  
  }
}
