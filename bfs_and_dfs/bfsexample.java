
public class bfsexample {
    // BFS is mostly used for seach the shortest path.. for reach the designation..
    // is question me services provide in the condition of emeryagency..
    // 0. hostiptal.
    // 1. Market.
    // 2. School.
    // 3. Mall
    // 4. Residential (house)..
    public static void main(String[] args) {
        BFSGraph area = new BFSGraph(5);
        area.addEdge(0, 1); // hostiptal -> Market
        area.addEdge(0, 2); // hostiptal -> School
        area.addEdge(1, 3); // Market -> Mall
        area.addEdge(1, 3); // Market -> Mall
        area.addEdge(2, 4); // School --> Residential

        // 0 -> 2 -> 1 -> 4 -> 3
        // 2,1
        // 1, 4 ye check karyaga 2 ka neigbour kon ha .. 4
        // 4, 3 is step is 1 ko explore karliya ha ..
        // 3 is step is 4 ko remove kardaya ha q is koi neigbour nhi ha..
        // nothing is step is 3 ko remove kardaya ha q is koi neigbour nhi ha..

        // final output
        // 0 -> 2 -> 1 -> 4 -> 3
        area.bfs(0);

    }
}

class BFSNode {
    int data;
    BFSNode next;

    BFSNode(int data) {
        this.data = data;
        this.next = null;
    }

}

// this class prefrom the
class MyQueue {
    int[] arr;
    // jab koi value insert hoti ha rear me increment hota ha.
    // jab koi value remove hoti ha fornt ki value increment.
    // capacity show the size of array..
    // count show how many values in data...
    int front, rear, capacity, count;

    MyQueue(int size) {
        this.capacity = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    boolean isEmpty() {
        return count == 0;
    }

    // prefrom the insertion in array..
    void enqueue(int data) {
        // this is prefrom the circular queue..
        if (count < capacity) {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            count++;
        }
    }

    // prefrom the deletion in array..

    int dequeue() {
        if (count > 0) {
            int data = arr[front];
            front = (front + 1) % capacity;
            count--;
            return data;
        }
        return -1;
    }
}

class BFSGraph {
    private BFSNode[] adjList;
    private int vertices;

    // this graph prefrom the undriect graph
    BFSGraph(int vertices) {
        this.vertices = vertices;
        // this below line and loop working on
        // jo new node aayaga wo is ko list me add karyaga ...
        adjList = new BFSNode[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = null;
        }
    }

    void addEdge(int source, int destination) {
        // source to destination..
        BFSNode newNode = new BFSNode(destination);
        newNode.next = adjList[source];
        adjList[source] = newNode;

        // destination to sources..
        newNode = new BFSNode(source);
        newNode.next = adjList[destination];
        adjList[destination] = newNode;
    }

    // this func show the start point of BFS graph
    void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        MyQueue queue = new MyQueue(vertices);

        visited[start] = true;
        queue.enqueue(start);

        System.out.println("Emergency Alert Broadcart Order ");
        while (!queue.isEmpty()) {
            int current = queue.dequeue();
            System.out.print("Area: " + current + " ");
            BFSNode temp = adjList[current];
            while (temp != null) {
                if (!visited[temp.data]) {
                    visited[temp.data] = true;
                    queue.enqueue(temp.data);
                }
                temp = temp.next;
            }
        }
        System.out.println();
    }
}