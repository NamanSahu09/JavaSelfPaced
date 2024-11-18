

import java.util.Stack;

// Node class represents a
// node in a linked list
class Node {
    // Data stored in the node
    int data;      
    // Pointer to the next
    // node in the list
    Node next;     

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class PalindromeLL
{ 
    public static Node reverseLinkedList(Node head) 
    {
            if (head == null || head.next == null) 
            {
                return head;
            }
    
            Node newHead = reverseLinkedList(head.next);
            Node front = head.next;
            front.next = head;
            head.next = null;
            return newHead;
        }
        
        public  boolean isPalindrome(Node head) 
        {
          
            if (head == null || head.next == null) {
          
                return true;
            }
        
            // Initialize two pointers, slow and fast,
            // to find the middle of the linked list
            Node slow = head;
            Node fast = head;
        
            // Traverse the linked list to find the
            // middle using slow and fast pointers
            while (fast.next != null && fast.next.next != null) {
                // Move slow pointer one step at a time
                slow = slow.next;
        
                // Move fast pointer two steps at a time
                fast = fast.next.next;
            }
        
            // Reverse the second half of the 
            // linked list starting from the middle
            Node newHead = reverseLinkedList(slow.next);
    
        // Pointer to the first half
        Node first = head;
    
        // Pointer to the reversed second half
        Node second = newHead;
        while (second != null) {
            // Compare data values of
            // nodes from both halves
    
            // If values do not match, the
            // list is not a palindrome
            if (first.data != second.data) {
                
                // Reverse the second half back
                // to its original state
                reverseLinkedList(newHead);
    
                // Not a palindrome
                return false;
            }
    
            // Move the first pointer
            first = first.next;
    
            // Move the second pointer
            second = second.next;
        }
    
        // Reverse the second half back
        // to its original state
        reverseLinkedList(newHead);
    
        // The linked list is a palindrome
        return true;
    }   


    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}

