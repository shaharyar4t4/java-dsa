package linkedlist;

public class insectionsinglelinkedlist {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // this variable is access on the Node Class because it is a private keyword "Encapulation"..
    
    // inserted the value at Start.. 
    public void insertAtstart(int value){

        Node newNode = new Node(value); // 10 -> 20 -> 30 -> 40 -> null   Add 5

        newNode.next = head;

        head = newNode;// make sure after insertion the value this is become head mean's first node   5 -> 10 -> 20 -> 30 -> 40 -> null
    }


    // inserted the value at End...
    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode; // make sure the value add the end  
            return;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
