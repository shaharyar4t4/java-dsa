package linkedlist;

public class circulardoublelinkedlist {

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

    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;// the prev value show the circular indicater point...
            return;
        }

        Node last = head.prev; // tail jo last wo basically prev value wo connect hojya head se

        newNode.next = head; // new node jab create hogi tu is head assign hojya ga
        newNode.prev = last;

        last.next = newNode; // basically the update last value is become new node value..
        head.prev = newNode;

    }

    // display the value....
    public void displayforward() {
        if (head == null) {
            System.out.print("list is empty!!");
            return;
        }
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void displaybackward() {
        if (head == null) {
            System.out.print("list is empty!!");
            return;
        }
        Node temp = head.prev;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.println();

    }

    public static void main(String[] args) {
        circulardoublelinkedlist list = new circulardoublelinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Traverse Forward... ");
        list.displayforward();

        System.out.println("Traverse backward... ");
        list.displaybackward();

    }

}
