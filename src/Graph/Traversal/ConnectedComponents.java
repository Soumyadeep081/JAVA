package Graph.Traversal;
import Graph.Implementation.AdjacencyList;


import java.util.*;
public class ConnectedComponents {
    public static void main(String[] args) {
        //Count number of connected components:
        AdjacencyList.Graph g=new AdjacencyList.Graph(8);
        g.addEdge(0,1,true);
        g.addEdge(1,2,true);
        g.addEdge(1,3,true);
        g.addEdge(0,2,true);

        g.addEdge(4,5,true);
        g.addEdge(6,7,true);

        System.out.println(f(g));
    }
    public static int f(AdjacencyList.Graph g){
        int c=0;
        HashMap<Integer,Boolean>visited=new HashMap<>();

        for(int i=0;i<g.v;i++){
            if(!visited.containsKey(i)){
                dfsHelper(g,i,visited);
                c++;
            }
        }
        return c;
    }

    private static void dfsHelper(AdjacencyList.Graph g, int src, HashMap<Integer, Boolean> visited) {
        visited.put(src,true);
        for(int node:g.adj[src]){
            if(!visited.containsKey(node))dfsHelper(g,node,visited);
        }
    }
}
