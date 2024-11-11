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
      ptr = head;
      while(ptr.next!=null)
      {
        ptr = ptr.next;
      }
      ptr.next = newNode;
    }

  }

  void insertAtStart(int d)
  {
    Node newNode = new Node();
    newNode.data = d;
    newNode.next = head;
    head = newNode;
  }


  void insertAtAnyLoc(int data,int loc)
  {
    if(loc == 0)
    {
      insertAtStart(data);
      return;
    }
    if(loc < 0)
    {
      System.out.println("Cant insert at negetive location.");
      return;
    }
    Node ptr = new Node();
    ptr = head;
    int cnt = 0;
    while(ptr != null)
    {
      cnt++;
      ptr = ptr.next;
    }
    if(loc > cnt)
    {
      System.out.println("Cant insert at location greater than size.");
      return;
    }
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    // Traverse to the correct location (just before the position)
    ptr = head;
    for (int i = 1; i < loc; i++) 
    {
        ptr = ptr.next;
    }

    // Insert the new node between ptr and ptr.next
    newNode.next = ptr.next;
    ptr.next = newNode;
   


  }






  void display()
  {
    Node ptr = new Node();
    ptr = head;
    while(ptr!=null)
    {
      System.out.print(ptr.data + " -> ");
      ptr = ptr.next;
    }
    System.out.print("null");
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
      
      list.insertAtAnyLoc(8, 2);
      System.out.println("Linked List: ");
      list.display();
  }
}
