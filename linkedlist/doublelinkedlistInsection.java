
public class doublelinkedlistInsection {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // this variable is access on the above class Node...
    private Node head;

    // insert the value at starting....
    public void insertAtStart(int data) {

        Node newNode = new Node(data);

        // this condition is enable when your list is empty..
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head; // this connection the head ..
        head.prev = newNode; // this connection the prev...

        head = newNode;
    }

    // insert the value at Ending....
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void insertAtindex(int index, int data) {

        // if they need to add the value in starting...
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head; // head is also target the current value..
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;

        }

        if (current == null) {
            System.out.println("Index is out of bound");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
            // the curent ka jo previous of next value wo newNode ki value hogi...
        }
        current.next = newNode;
    }

    // travseing...
    public void display() {
        Node current = head;
        System.out.print("View of List.. ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        doublelinkedlistInsection list = new doublelinkedlistInsection();

        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        list.display();

        System.out.println();
        System.out.println("Add the value Ending..");
        list.insertAtEnd(50);
        list.display();

        System.out.println();
        System.out.println("Add the value middle..");
        list.insertAtindex(1, 5);
        list.display();

    }

}
