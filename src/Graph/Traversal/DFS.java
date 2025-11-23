package Graph.Traversal;
import Graph.Implementation.AdjacencyList;


import java.util.*;
public class DFS {
    public static void main(String[] args) {
        AdjacencyList.Graph g=new AdjacencyList.Graph(8);
        g.addEdge(2,1,true);
        g.addEdge(2,3,false);
        g.addEdge(2,5,false);
        g.addEdge(6,2,false);
        g.addEdge(6,7,false);
        g.addEdge(7,5,false);
        g.addEdge(4,3,false);
        g.addEdge(4,7,false);

        dfs(g,1);
    }
    public static void dfs(AdjacencyList.Graph g,int src){
        Set<Integer> visited=new HashSet<>();
        DFSHelper(g, src, visited);
        for(int i=0;i<g.adj.length;i++){
            if(!visited.contains(i))DFSHelper(g,i,visited);
        }

    }

    private static void DFSHelper(AdjacencyList.Graph g,int src, Set<Integer> visited) {
        visited.add(src);
        System.out.print(src+" ");
        for(int neighbour: g.adj[src]){
            if(!visited.contains(neighbour)){
                DFSHelper(g,neighbour,visited);
            }

        }
    }
}
