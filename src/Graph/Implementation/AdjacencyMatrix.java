package Graph.Implementation;

public class AdjacencyMatrix {
    static class Graph{

            private int[][] adjMatrix;
            private int vertices;
            private boolean isDirected;
            public Graph(int vertices, boolean isDirected){
                this.vertices=vertices;
                this.isDirected=isDirected;
                adjMatrix=new int[vertices][vertices];
            }
            public void addEdge(int u,int v){
                adjMatrix[u][v]=1;
                if(!isDirected) adjMatrix[v][u]=1;
            }
            public void printGraph(){
                for(int i=0;i<vertices;i++){
                    for(int j=0;j<vertices;j++){
                        System.out.print(adjMatrix[i][j]+" ");
                    }
                    System.out.println();
                }

        }
    }

    public static void main(String[] args) {
        Graph g=new Graph(8,true);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,1);
        g.addEdge(2,3);
        g.addEdge(2,5);
        g.addEdge(6,2);
        g.addEdge(6,7);
        g.addEdge(7,5);
        g.addEdge(4,3);
        g.addEdge(4,7);

        g.printGraph();

    }
}
