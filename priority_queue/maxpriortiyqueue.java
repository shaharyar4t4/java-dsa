package priority_queue;

public class maxpriortiyqueue {
    private int[] heap;
    private int size; // the size of array....
    private int capacity; // the capacity of array..

    public maxpriortiyqueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity]; // they show capacity of an array..
        this.size = 0; // they show "0" means the size of array right is zero..
    }

    // Parent child node
    // ye par (i) ka mtlab ye ha kiya current index value ko refer karta ha
    // pick the " 10" ==> [3]
    // parent = (i -1)/2 ==> (3 -1)/2 ==> 2/2 => 1 ---> 10 ka parent jo wo 30 ha..

    private int parent(int i) {
        return (i - 1) / 2;
    }
    // left child node
    // ye par (i) ka mtlab ye ha kiya current index value ko refer karta ha
    // pick the "30" ==> [1]
    // left = 2 * i + 1 ==> 2 * 1 + 1 ==> 2 + 1 => 3 ---> (left child ki value 10
    // aayi jab hum na index value [1])..

    private int leftChild(int i) {
        return (2 * i) + 1;
    }

    // right child node
    // ye par (i) ka mtlab ye ha kiya current index value ko refer karta ha
    // pick the '15' == > [0]
    // right = 2 * i + 2 == > 2* 0 + 2 ==> 0 + 2 => 2 (right child ki value 14 hogi
    // aayi jab hum na index value [0]..)
    private int rightChild(int i) {
        return (2 * i) + 2;
    }

    // this fnc is help to check the parent is available or not?
    private boolean hasParent(int i) {
        return parent(i) >= 0;
    }

    // this fnc is help to check the left is available or not?
    private boolean hasLeftChild(int i) {
        // agar value
        return leftChild(i) < size;
    }

    // this fnc is help to check the right is available or not?
    private boolean hasRightChild(int i) {
        // agr value right child se zadaya hogi tu ap ka right exist nhi karta ha..
        return rightChild(i) < size;
    }

    private void swapp(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Time complex : 0 (logn)
    // Insertion preform.. (Enqueue prefrom)
    public void insert(int value) {
        // check the queue is full or not
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        heap[size] = value;
        size++;
        // heapify up (is ko concept ko bubble hub bha bolta ha) ==>
        // Reason: is ko hum jab use karta ha jab heap me value add ye phir delete ho
        // dono humme make sure karna hota ha jese tu heapify ka concept implement
        // hoga..
        heapifyUp();

    }

    // HeapifyUp fun...
    private void heapifyUp() {
        int index = size - 1;
        // ye loop check karta karta ha ap ki value humsha (Parent value) small hogi
        // child se... q kiya yehe min heap ka concept ha...
        while (hasParent(index) && heap[parent(index)] < heap[index]) {
            swapp(parent(index), index);
            index = parent(index);
        }

    }

    // Time complex : 0 (logn)
    // Remove value Opeation (Dequeue prefrom..)
    public int removeMax() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int maxValue = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // heapifyDown is use ko manage the heap rule when the value is remove..
        // it is also called.. sing down..
        heapifyDown();
        return maxValue;

    }

    // preform the function of heapdown..
    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int largestChildIndex = leftChild(index);

            if (hasRightChild(index) && heap[rightChild(index)] > heap[largestChildIndex]) {
                largestChildIndex = rightChild(index);
            }
            if (heap[index] >= heap[largestChildIndex]) {
                break;
            } else {
                swapp(index, largestChildIndex);
            }
            index = largestChildIndex;
        }
    }

    // show the peak value..
    // Time complex: 0 (1)
    public int printprek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return heap[0];
    }

    // show the show queue value..
    public void showQueue() {
        for (int i = 0; i < size; i++) {
            System.out.println(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        maxpriortiyqueue minpq = new maxpriortiyqueue(5);
        minpq.insert(10);
        minpq.insert(30);
        minpq.insert(5);
        minpq.insert(40);
        minpq.insert(20);

        System.out.println("Min Priority queue: ");
        minpq.showQueue();
        System.out.println("Min Priority Peak queue: " + minpq.printprek());
        System.out.println("Remove the value:" + minpq.removeMax());
        System.out.println("After Remove the Max value: ");
        minpq.showQueue();
    }
}
