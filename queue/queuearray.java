

public class queuearray {
    int[] arr;
    int front;
    int rear;
    int capacity; // capacity of array
    int count; // no of value in queue..

    public queuearray(int size) {
        arr = new int[size];
        capacity = size; // size of array
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        // linear queue ... we don't use this one
        // rear++;

        // linear dequeue
        // front ++

        // circular queue jese hum is ki help se enqueue ka process karya ga ...
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
        System.out.println("Inserted: " + item);

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }

        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // return the front values..
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == capacity);
    }
 // display the queue elements..
    public void printQueue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty...");
            return;
        }

        System.out.print("Queue Element: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.println(arr[index] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        //important notes :

        // jab me value queue me add karta hu to rear ki value change hoti...
        // jab me value queue se remove karta hu to front ki value change hoti hai ...
        queuearray queue = new queuearray(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.printQueue();

        int removed = queue.dequeue();
        System.out.println("Dequeue element is:" + removed);
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();

    }

}
