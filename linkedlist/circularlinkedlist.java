package linkedlist;

public class circularlinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // insertion the value
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            // this condition the show circlar linked list the -> is again connect the head
            // value
        } else {

            // when you have a value in linked list...
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Display the value's
    public void display() {
        if (head == null) {
            System.out.println("list is Empty!");
            return;

        }

        Node current = head;
        // why you use the do while?
        // Beause you the circular linked list when you used while or for this loop does
        // not terminted....
        do {
            System.out.print(current.data + " --> ");
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        circularlinkedlist list = new circularlinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("Circular Singly Linked List:");
        list.display();
    }
}
