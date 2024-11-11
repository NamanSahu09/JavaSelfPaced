import java.io.*;
class Node
{
  Node prev;
  int data;
  Node next;
}
class DD
{
  Node head;
  Node tail;
  void insert(int data)
  {
    Node newNode = new Node();
    newNode.prev = null;
    newNode.data = data;
    newNode.next = null;
    if(head == null)
    {
      head= newNode;
      tail = newNode;
    }
    else
    {
      tail.next = newNode;
      tail.prev = tail;
      tail = newNode;
    }
  }

  void reverseDD()
  {
    Node n = head;
    Node ptr = head;
    while(n != null)
    {
      n = ptr;
      Node temp = ptr.next;
      ptr.next = ptr.prev;
      ptr.prev = temp;
      
    }
  }


  void display()
  {
    Node ptr = head;
    while(ptr != null)
    {
      System.out.print(ptr.data+" -> ");
      ptr = ptr.next;
    }
  }

}
public class revDD
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    DD obj = new DD();
    obj.insert(10);
    obj.insert(20);
    obj.insert(30);
    obj.display();
    System.out.println("Displaying the reverse of doubly linked list");
    obj.reverseDD();
    obj.display(); 

  }
}