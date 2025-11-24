package Graph.Traversal;
import Graph.Implementation.AdjacencyList;


import java.util.*;
public class BFS {
    public static void main(String[] args) {
        AdjacencyList.Graph g=new AdjacencyList.Graph(8);
        g.addEdge(0,1,true);
        g.addEdge(0,2,true);
        g.addEdge(1,3,true);
        g.addEdge(1,4,true);
        g.addEdge(2,3,true);
        g.addEdge(2,6,true);
        g.addEdge(4,5,true);
        g.addEdge(6,5,true);
        g.addEdge(5,7,true);


        bfs(g,0);
    }

    public static void bfs(AdjacencyList.Graph g, int src) {
        HashSet<Integer>visited=new HashSet<>();
        List<Integer>res=new ArrayList<>();
        helper(g,src,visited,res);
        for(int i=0;i<g.adj.length;i++){
            if(!visited.contains(i))helper(g,i,visited,res);
        }

        System.out.println(res);

    }
    private static void helper(AdjacencyList.Graph g,int src,HashSet<Integer>visited,List<Integer>res){
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        visited.add(src);
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for (int nbr : g.adj[node]) {
                if (!visited.contains(nbr)) {
                    visited.add(nbr);
                    q.add(nbr);
                }
            }
        }

    }


}
