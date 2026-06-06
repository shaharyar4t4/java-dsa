package linkedlist;

public class doublelinkedlistdelection {
    
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next =null;
            this.prev =null;
        }
    }

    private Node head;

    public void insertAtEnd(int data){

        Node newNode = new Node(data);

        // Head (First node) suppose you have a single node this is your first node
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;

    }

    // delete the value from start...
    public void deleteAtStart(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // delete the value from ending...
    public void deleteAtEnd(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;  // means the --> next ki value null or prev is back value hojya gi
       

    }

    //delete the value from index 
    public void deletefromindex(int index){
           // if the list empty..
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            deleteAtStart();
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index) {
            temp = temp.next;
            count ++;            
        }

        if (temp == null) {
            System.out.print("out of bond");
        }

        // let suppose
        // 10 <-> 20 <-> 40 <-> 50
        // node = 1(index) ko remove karna
        // 20 ko remove hojaya ga by 40 ka prev ab 10 ka next bn jaya ga...
         if(temp.prev != null){
            temp.prev.next = temp.next;
        }

        // let suppose
        // 10 <-> 20 <-> 40 <-> 50
        // node = 1(index) ko remove karna
        // 20 ko remove hojaya ga by 40 ka prev ab 10 ka next bn jaya ga... 
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }

        
    }


    // display the values...
        public void display() {
        Node current = head;
        System.out.print("View of List.. ");
        while (current != null) {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.print("null");

    }



    public static void main(String[] args) {
        doublelinkedlistdelection list = new doublelinkedlistdelection();

        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.display();

        System.out.println();
        System.out.println("Delete from Starting...");
        list.deleteAtStart();
        list.display();

        System.out.println();
        System.out.println("Delete from Ending...");
        list.deleteAtEnd();
        list.display();

        System.out.println();
        System.out.println("Delete from Specific index...");
        list.deletefromindex(1);
        list.display();

    }

}
