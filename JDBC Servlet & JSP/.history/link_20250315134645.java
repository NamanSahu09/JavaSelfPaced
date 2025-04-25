import java.util.*;

class Link {
    Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node ptr = head;
            while (ptr.next != null) { // Traverse till the last node
                ptr = ptr.next;
            }
            ptr.next = newNode; // Link last node to newNode
        }
    }
    void rev(Node head)
    {
      Node prev = null;

      Node ptr = new Node();
      while(ptr != null)
      {
        Node temp = ptr.next;
      ptr.next = prev;
      prev = ptr;
      ptr = temp;
    }
    void display() {
        Node ptr = head;
        System.out.print("Linked List: ");
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        Link obj = new Link();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();
        int j = 65;
        
        for (int i = 0; i < n; i++) {
            char c = (char) j;
            System.out.print("Enter a number to insert (Node " + c + "): ");
            int no = sc.nextInt();
            j++;
            obj.addNode(no); // Corrected method call
        }

        obj.display(); // To print the linked list
        sc.close();
    }
}
