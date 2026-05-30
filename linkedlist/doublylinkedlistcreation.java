package linkedlist;

public class doublylinkedlistcreation {

    // static class means it's a independent class they don't need the object call
    // in main function...
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }


    Node head;

    // create doubly linked List...
    public void createList(){
                Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fouth = new Node(40);

        head = first; // head node become the first node...

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fouth;
        fouth.prev = third;
    }

    // forward traversing...
    public void traverseForward() {
        Node current = head;
        System.out.println("Forward Traverseal: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // backward traversing...
    public void traversBackward() {
        Node current = head;

        // current.next mean's humme current ki value ta jana like last value ta jana ha
        // ...
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("\n Backward Traverseal: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev; // prev mean's move to backward....
        }
        System.out.print("null");

    }


    public static void main(String[] args) {

        doublylinkedlistcreation list = new doublylinkedlistcreation();

        list.createList();

        list.traverseForward(); // 10 -> 20 -> 30 -> 40 -> null

        list.traversBackward(); // 40 -> 30 -> 20 -> 10 -> null
    }

}
