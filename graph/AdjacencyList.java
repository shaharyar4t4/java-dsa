public class AdjacencyList{
    public static void main(String [] args){
            Graph listshow = new Graph(4);
            System.out.println("show the Adjaceny List");
            listshow.addEdge(0,1);
            listshow.addEdge(0, 2);
            listshow.addEdge(1, 3);
            listshow.addEdge(2, 3);
            listshow.displayList();

            System.out.println("After removing the Adjacency List b/w 0, 1");
            listshow.removeEdge(0, 1);
            listshow.displayList();
    }
}



class MyNode{
    int data;
    MyNode next;

    MyNode(int data){
        this.data = data;
        this.next = null;
    }
}

// manage our graph 
class Graph{
    private MyNode[] adjList;
    private int vertices;

    public Graph(int vertices){
        this.vertices = vertices;
        //is below line ka mtlab ha jitni lines ha itni he vertices create hogi..
        adjList = new MyNode[vertices];

        // is loop ki help se vertices bni gi or node bha create hota raha ha...
        for(int i = 0; i < vertices;  i++ ){
            adjList[i] = null;
        }
    }

    // prefrom the insection method..
    public void addEdge(int sources, int designation){

        // sources --> designation
        // is line me hum sources ko call karya ga..
        MyNode newNode = new MyNode(designation);
        newNode.next = adjList[sources]; 
        adjList[sources] = newNode;

        // the below line is show the logic of Undriected graphs..
        // is line me hum designation ko call karya ga..
        newNode = new MyNode(sources);
        newNode.next = adjList[designation]; 
        adjList[designation] = newNode;

    }

    // perfrom the removeing the edge(lines)..
    public void removeEdge(int sources, int designation){
        // remove the souces value like user(A) na user(B) ko remove kardya 
        adjList[sources] = removeNode(adjList[sources], designation);
        // tu ab user(b) bha user(A) ko remove kardaya ga..
        adjList[designation] = removeNode(adjList[designation], sources);
    }

    //prefrom the removeing of Node 
    private MyNode removeNode(MyNode head, int value){
        // if the head become is null tu apki head value nhi ha 
        if(head == null){
            System.out.println("Head is null");
            return null;
        }
        // the node value found in first .. so this condition available..
        if(head.data == value){
            return head.next;
        }
        // last or mid ye value
        MyNode current = head;
        while(current.next != null){

            // ye condition ki meri req value muhja mil kiya nhi... 
            // let suppose is ko req value mil for example 1,2,3 ---> or hum 2 ko remove karna ha tu ye karya ga ye 1 se driect connect hojaya 3 se..
            if(current.next.data == value){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return head;
    }
    // show the adjaceny detials
    public void displayList(){

            for(int i =0; i< vertices; i++){
                System.out.print(i + " -> ");
                MyNode temp = adjList[i];
                while(temp !=null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }

                System.out.println();

            }
    }


}

