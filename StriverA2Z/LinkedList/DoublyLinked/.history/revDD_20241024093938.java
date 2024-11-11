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
      tail.prev = 
      tail.next = newNode;
      tail = newNode;
    }
  }
}
public class revDD
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


  }
}