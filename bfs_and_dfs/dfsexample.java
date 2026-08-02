public class dfsexample {
    public static void main(String[] args) {
        DFSGraph city = new DFSGraph(5);

        city.addEdge(0, 1);// 0 ->1
        city.addEdge(0, 2);// 0 ->2
        city.addEdge(1, 3);// 1 ->3
        city.addEdge(2, 4);// 2 ->4
        // 0-> 1
        // city.addEdge(3, 5);// 0 ->1
        // exp output ==> 0 -> 2 -> 4 -> 1 -> 3
        city.dfs(0);

    }
}

class DFSNode {
    int data;
    DFSNode next;

    DFSNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class DFSGraph {
    private DFSNode[] adjList;
    private int vertices;

    // create the vertices..
    public DFSGraph(int vertices) {
        this.vertices = vertices;
        adjList = new DFSNode[vertices];
    }

    public void addEdge(int sources, int destination) {
        // node create then data move the new node
        // souces --> destintion
        DFSNode nOne = new DFSNode(destination);
        nOne.next = adjList[sources];
        adjList[sources] = nOne;

        // destination --> sources.
        DFSNode nTne = new DFSNode(sources);
        nTne.next = adjList[destination];
        adjList[destination] = nTne;

    }

    // prefrom the dfs process --->
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Visited Order: ");
        // main logic of this code like ye prefrom karya ga dfs method undirect graph
        // (social app)
        dfsRec(start, visited);

    }

    private void dfsRec(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print("Area " + node + " ");

        // temp is explore the neigbour node or previces node..
        DFSNode temp = adjList[node];

        while (temp != null) {
            if (!visited[temp.data]) {
                dfsRec(temp.data, visited);
            }
            temp = temp.next;
        }
    }

}