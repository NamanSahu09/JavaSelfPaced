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

    Node rev(Node head) {
        Node prev = null;
        Node ptr = head; // Initialize with head

        while (ptr != null) {
            Node temp = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = temp;
        }
        return prev; // Return new head after reversal
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
            obj.addNode(no);
        }

        obj.display(); // Print the original linked list

        // Reverse the linked list
        obj.head = obj.rev(obj.head);
        System.out.println("Reversed Linked List: ");
        obj.display(); // Print the reversed linked list

        sc.close();
    }
}
