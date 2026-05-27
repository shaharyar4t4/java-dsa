package linkedlist;

public class singlelinkedlist {
    // single linked list class
    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null; // always the next node is null..
        }
    }

    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;  // first node --> seconed
        second.next = third; // second node --> third
        third.next = fourth; // third node -- > fourth

        Node head = first; // head node is basically start point of any Linked List..

        //  traversing ... visted the each node..
        System.out.print("Linked list Elements: ");

        Node current = head; // inital first node value = 10
        
        // this loop print each node values...
        while (current != null) {
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.print("null");

    }
}
