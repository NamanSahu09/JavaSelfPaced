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
        
      }
    }

  }

}

public class Main
{
  public static void main(String args[])
  {

  }
}