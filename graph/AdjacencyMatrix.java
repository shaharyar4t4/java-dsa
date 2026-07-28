class AdjacencyMatrix{

  public static void main(String [] args){
        adjacencymatrixgraph adjmatrix = new adjacencymatrixgraph(4);
        adjmatrix.addEdge(0, 1, 10);
        adjmatrix.addEdge(0, 2, 15);
        adjmatrix.addEdge(1, 3, 20);
        adjmatrix.addEdge(2, 3, 25);
        adjmatrix.displaygraph();
  }
}

class adjacencymatrixgraph{

    // the adjacency matrix --> is working on 2D array..
    private int[][] matrix;
    private int vertices; // vertices is denoted the line

    public adjacencymatrixgraph(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices]; // this show the 2D array.. in matrix 
    }
    // this is proper used for the insertion opeation..
    // this show me the graph is undriected beasuse they wanted designation and weight
    // in short the edge are connected with each others.
    public void addEdge(int sources, int designation, int weight){
        matrix[sources][designation] = weight;  // A--> B  
        // this is basically same think like a is connected to b while on other hand b is connected the A..
        matrix[designation][sources] = weight;// A <--- B
    }

    // this is proper used for the remove opeation..
    public void removeEdge(int sources, int designation ){
        matrix[sources][designation] = 0;
        matrix[designation][sources] = 0;
    }

    // has checking edge is available in two node..
    public boolean hasEdge(int sources, int designation){
        return matrix[sources][designation] != 0;

        // the return "true" --> mtlab 2 edges nodes se connected ha..
        // the return "false" --> mtlab 2 edges nodes se connected nhi ha..

    }

    // the show case of graph values..
    public void displaygraph(){
        System.out.println("Adjacency Matrix: ");
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

