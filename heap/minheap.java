public class minheap{
    // time complex ==> 0(log n)

    private int[] heap;
    private int size; // size of array like abhi array me kitna values ha..
    private int capacity; // kitni capacity ha like array me max kitna element ko add hosaata hai..

    public minheap(int capacity){
        this.capacity = capacity;
        // initallize the capacity... of array
        heap = new int[capacity];
        size = 0;
    }
     // [15 , 30 , 14 , 10, 20 ] ==>  [0, 1, 2, 3, 4]
    // some formule -- where you get the parent node and left child node and right child node...
    
    // Parent child node 
    // ye par (i) ka mtlab ye ha kiya current index value ko refer karta ha 
    // pick the " 10" ==> [3]
    // parent = (i -1)/2 ==> (3 -1)/2 ==> 2/2 => 1 ---> 10 ka parent jo wo 30 ha..

    private int parent(int i ){
        return (i - 1)/2;
    }
    // left child node 
    // ye par (i) ka mtlab ye ha kiya current index value ko refer karta ha 
    // pick the "30" ==> [1]
    // left = 2 * i + 1 ==> 2 * 1 + 1 ==> 2 + 1 => 3 ---> (left child ki value 10 aayi jab hum na index value [1])..
    
    private int leftChild(int i){
        return  2 * i + 1;
    }
    // right child node 
    // ye par (i) ka mtlab ye ha kiya current index value ko refer karta ha 
    // pick the  '15' == > [0]
    // right = 2 * i + 2 == > 2* 0 + 2 ==> 0 + 2 => 2 (right child ki value 14 hogi aayi jab hum na index value [0]..)  
    private int rightChild(int i){
        return 2 * i + 2;
    }

    // insert the value in Heap..
    public void insert(int value){
        // this condition help to check the heap have a space or not?
        if(size == capacity){
            System.out.println("Heap is Full");
            return;
        }
        // this line add the value in last ..
        heap[size] = value;
        int current = size;
        size++;

        // heapify up (is ko concept ko bubble hub bha bolta ha) ==> 
        // Reason: is ko hum jab use karta ha jab heap me value add ye phir delete ho dono humme make sure karna hota ha jese tu heapify ka concept implement hoga..
        while(current > 0 && heap[current] < heap[parent(current)]){
            // perform the swapping process..
            swap(current, parent(current));
            current = parent(current);
        }

    }
    // time complex ==> 0(1)
    // space complex ==> 0(n)
    // this method add the new value in last of heap..
    public int extractMin(){
        if(size == 0){
            System.out.println("Heap is Empty");
            return - 1;
        }
        int min = heap[0];
        heap[0] = heap[size -1];
        size --;
        heapify(0);
        return min;
    }
    // this method prefrom the heap managnment.. ik question bha bnaya me na for remember this concept
    private void heapify(int index){
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < size && heap[left] < heap[smallest]){
            smallest = left;
        }
        if(right < size && heap[right] < heap[smallest]){
            smallest = right;
        }
        if(smallest != index){
            swap(index, smallest);
            heapify(smallest);
        }

    }
    // prefrom swapping process
    private void swap(int i, int j){
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
    }

    public void showHeapdata(){
        for(int i =0 ; i< size; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }



    public static void main(String [] args){
        minheap heapdata = new minheap(10);
        heapdata.insert(20);
        heapdata.insert(30);
        heapdata.insert(15);
        heapdata.insert(5);
        heapdata.insert(10);

        System.out.println("Inserted Heap values: ");
        heapdata.showHeapdata();    

        System.out.println("Extract Min Value: "+ heapdata.extractMin());

        System.out.println("After the Deletion process ");
        heapdata.showHeapdata();    


    }
}



// small question -- drag run

// Heap: [5, 10, 20]
// insert 2

// Add at last [5, 10 , 20] (index 3) ==> array become ==> [5, 10, 20, 2]

// sub phela hum "2" ki parent value find karya ga 
// a/c to formula ==>  (i - 1)/2 ==> (3 - 1)/ 2 ==> 2/2 => 1 (value become find 10)..

// now ab hogi swapping.. [5, 2, 20, 10]

// ab "2" ka parent ==> 5 ha..

// a/c to formula ==> (i - 1)/2 ==> (1-1)/2 => 0/2 ==> stop q zero ka koi index nhi hota ha ..
