public class queuelinkedlist {

    private Node front, rear;
    private int size;

    public queuelinkedlist() {
        this.front = this.rear = null;
        // the above line show mean the queue is created... but they have not element in
        // queue...
        this.size = 0;
    }

    // insecting the value in queue...
    // Time complex ===> o(1)
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode; // both front and rear postion on same point....
            System.out.print("\n Inserted: " + item);

        } else {
            rear.next = newNode;
            rear = newNode;
            System.out.print("\n Inserted: " + item);
        }
        size++;
    }

    // Remove the value in queue..
    // Time complex ==> o(1)
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is underflow - Nothing to Delele...");
            return -1;
        }
        int value = front.data; // front is ko point karha is store kardo value kiya variable me...
        front = front.next;

        // if the queue have no value.. so front and rean value become null ..
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    // show the value on the top of LinkedList..
    // Time complex ===> o(1)
    public int peek() {
        if (front == null) {
            System.out.println("Queue is Empty!..");
            return -1;
        }

        return front.data;
    }

    // show the queue size..
    public int getSize() {
        return size;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Queue Elements: ");
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queuelinkedlist queue = new queuelinkedlist();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.displayQueue();
        int size = queue.getSize();
        System.out.println("Size: " + size);

        System.out.println("Front Element: " + queue.peek());

        int removed = queue.dequeue();
        System.out.println("Removed: " + removed);
        queue.displayQueue();
    }

}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
