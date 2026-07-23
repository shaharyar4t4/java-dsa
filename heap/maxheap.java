public class maxheap{

    private int [] heap;
    private int size; // size of aray..
    private int capacity;// how much capacity like kitna element add hosaata ha.

    public maxheap(int capacity){
        this.capacity = capacity;
        // initallize the capacity .. of array
        heap = new int[capacity];
        size = 0;
    }

    // get the parent node
    private int parent(int i){
        return(i - 1)/2;
    }

    //get the left child node
    private int leftChild(int i){
        return 2 * i + 1;
    }

    // get the right child node..
    private int rightChild(int i){
        return 2 * i + 2;
    }

    // insert the value in heap
    public void insert(int value){
        if(size == capacity){
            System.out.println("Heap is Full");
            return;
        }
        // this line add the value in last..
        heap[size] = value;
        int current = size;
        size ++;

        // prefrom heapify
        while(current > 0 && heap[current] > heap[parent(current)]){
            // prefrom the swapping..
            swap(current , parent(current));
            current = parent(current);
        }
    }

    // fetching the max value...
    public int extractMax(){
        if(size == 0){
            System.out.println("Heap is Empty");
            return - 1;
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size-- ;
        heapify(0);
        return max;
    }

    private void heapify(int index){
        int largest =  index;
        int left = leftChild(index);
        int right =  rightChild(index);

        if(left < size && heap[left] > heap[largest]){
            largest = left;
        }
        if(right < size && heap[right] > heap[largest]){
            largest = right;
        }
        if(largest != index){
            swap(index, largest);
            heapify(largest);
        }
    }
    
     // prefrom swapping process
    private void swap(int i, int j){
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
    }

   public void showHeapdata(){
    for(int i = 0; i < size; i++){
        System.out.print(heap[i] + " ");
    }
    System.out.println();
   }


    public static void main(String [] args){
        maxheap heapdata = new maxheap(10);
        heapdata.insert(20);
        heapdata.insert(30);
        heapdata.insert(15);
        heapdata.insert(5);
        heapdata.insert(10);

        System.out.println("Inserted Heap values: ");
        heapdata.showHeapdata();    

        System.out.println("Extract Max Value: "+ heapdata.extractMax());

        System.out.println("After the Deletion process ");
        heapdata.showHeapdata();    

    }
}