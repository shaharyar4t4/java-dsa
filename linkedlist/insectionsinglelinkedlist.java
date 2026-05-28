package linkedlist;

public class insectionsinglelinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // this variable is access on the Node Class because it is a private keyword
                       // "Encapulation"..

    // inserted the value at Start..
    public void insertAtstart(int value) {

        Node newNode = new Node(value); // 10 -> 20 -> 30 -> 40 -> null Add 5

        newNode.next = head;

        head = newNode;// make sure after insertion the value this is become head mean's first node 5
                       // -> 10 -> 20 -> 30 -> 40 -> null
    }

    // inserted the value at End...
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode; // make sure the value add the end of any node
            return;
        }

        Node current = head; // current ki value first node hogi..

        // ye loop jab ta chala ga jab ta null na aayjaya means last node aaja
        while (current.next != null) {
            current = current.next;
        }

        // jese value null hogi wese he new Node add hojaya gi...
        current.next = newNode;
    }

    // make sure linked list me indexing nhi hoti q ye concept only for array kiya
    // liya hota ha ..
    // insertion the value at middle...
    public void insertionAtmiddle(int value, int index) {

        // for Invalid the insertion..
        if (index < 0) {
            System.out.println("Invalid Indexed");
        }

        // for insertion at the start of index...
        if (index == 0) {
            insertAtstart(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head; // current become first node value...
        int count = 0;

        // current value null aajaya ( true) next second the node value always -1 mean
        // preious current humsha ik kam hogi...
        while (current != null && count < index - 1) {
            current = current.next;
            count++; // tracking the index value mean (input value)

        }

        if (current == null) {
            System.out.println("Index out of bounds..");
            return;
        }
        // new value (node) hogi ab current ki place me aajaya ga ...
        newNode.next = current.next;
        current.next = newNode;
    }

    public void traverse(){
        Node current  = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        insectionsinglelinkedlist list = new insectionsinglelinkedlist();
        
        //add the value at end..
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.traverse(); // 20 -> 30 -> 40 -> null

        // insertion the value in starting...
        System.out.println();
        list.insertAtstart(10);
        list.traverse();

        // insertion value in middle ....
        System.out.println();
        list.insertionAtmiddle(5, 3);
        list.traverse();

    }

}
