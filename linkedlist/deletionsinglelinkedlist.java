package linkedlist;

public class deletionsinglelinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // insetion at the End..
    public void insertedAtEnd(int data) {
        Node newNode = new Node(data);

        // jese null value aati tu newnode ki value aajya null se phela
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        // ye loop jab ta chala ga jab ta null na aajya..
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // delete from starting...
    // o(1) time complexity..
    public void deleteAtstart() {
        // if the list empty..
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next; // head -> 10 -> 20 -> 30 -> null -----> // head -> 20 -> 30 -> null..

    }

    // delete from Ending...
    // o(n) time complexity
    public void deleteFormEnd() {
        // if the list empty..
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // if some case ap ki linked list me ik one node ho to hogya ye head node he -->
        // null hojya means head node frist node bn jaya gi...
        if (head.next == null) {
            head = null;
            return;
        }

        // important node singly linked lsit me forward jasaata but backward nhi jasaata
        // ha ...
        // head -> 10 -> 20 -> 30 -> null -----> // head -> 20 -> null
        // null become the second last node...
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // delete form middle or any node...
    // o (n) time complexity..
    public void deletefromindex(int index) {
        // if the list empty..
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            deleteAtstart();
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.print("out of bond");
        }
        current.next = current.next.next; // inshort skip one node..
    }
    // tarvering...
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        deletionsinglelinkedlist list = new deletionsinglelinkedlist();

        // call end fnc..
        System.out.print("Orgiral list...: ");
        list.insertedAtEnd(10);
        list.insertedAtEnd(20);
        list.insertedAtEnd(30);
        list.insertedAtEnd(40);
        list.insertedAtEnd(50);
        
        list.display();


        System.out.println();
        // delete from start..
        list.deleteAtstart();
        list.display();


        System.out.println();
        // delete from end..
        list.deleteFormEnd();
        list.display();

         System.out.println();
        // delete from specific index ..
        list.deletefromindex(1);
        list.display();
    }
}
