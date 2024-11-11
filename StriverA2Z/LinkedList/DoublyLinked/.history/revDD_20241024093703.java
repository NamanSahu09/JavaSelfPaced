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
    newNode.data = data;
    if(head == null)
    {
      head= newNode;
      tail = newNode;
    }
    else
    {
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