class Node
{
  int data;
  Node next;
}

class LinkedList
{
  Node head;
  void insert(int d)
  {
    Node newNode = new Node();
    newNode.data = d;
    newNode.next = null;
    if(head == null)
    {
      head = newNode;
    }
    else
    {
      Node ptr = new Node();
      while(ptr.next!=null)
      {
        ptr = ptr.next;
      }
      ptr.next = newNode;
    }

  }
  void display()
  {
    Node ptr = new Node();
    while(ptr!=null)
    {
      System.out.print(ptr.data + " -> ");
      ptr = ptr.next;
    }
  }

}

public class Main
{
  public static void main(String args[])
  {
      LinkedList list = new LinkedList();
      list.insert(10);
      list.insert(20);
      list.insert(30);
      System.out.println("Linked List: ");
      list.display();
  }
}
