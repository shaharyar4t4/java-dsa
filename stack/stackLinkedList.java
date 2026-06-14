package stack;

public class stackLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    // constructor which help to initial the top value in stack... inshort top =
    // null means the stack is empty...
    public stackLinkedList() {
        this.top = null;
    }

    // insert the value in stack....
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top; // add the value on top mean yehe se value stack me jana stark hojya gi...
        top = newNode;
        System.out.println("Inserted:" + x);
    }

    // delete the value on stack...
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        // one more fnc isfull is ko hum tab bna ta jab humme array me kam karna hota ha
        // ... q kiya array ka size fix hota ha ...
        int popped = top.data;
        top = top.next; // top become the next value means humme is ko remove karna hota ha is ko hum is
                        // kiya note arrow ko change karta ha...
        return popped;
    }

    // read the top value by using peek method...
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }

    // Empty stack..
    public boolean isEmpty() {
        return top == null;
    }

    // Display all the values....
    public void displaylist() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.print("Stack Elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackLinkedList list = new stackLinkedList();
        // push
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.displaylist();

        System.out.println();
        // remove == pop
        System.out.print("Top Element stack: " + list.peek());

        System.out.println();
        int removed = list.pop();
        System.out.print("Removed Element:" + removed + "\n");
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.displaylist();

    }
}
