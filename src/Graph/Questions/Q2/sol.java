package Graph.Questions.Q2;
import Graph.Implementation.AdjacencyList;


import java.util.*;

public class sol {
    public static void main(String[] args) {
        AdjacencyList.Graph g=new AdjacencyList.Graph(6);
        g.addEdge(0,1,true);
        g.addEdge(1,3,true);
        g.addEdge(3,5,true);
        g.addEdge(3,4,true);
        g.addEdge(5,4,true);

        System.out.println(f(g,1,5));
    }
    public static int f(AdjacencyList.Graph g,int src,int dest){

        Set<Integer>visited=new HashSet<>();
        int[]parent=new int[g.v];
        int[]dist=new int[g.v];
        Queue<Integer>q=new LinkedList<>();
        Arrays.fill(parent,-1);
        visited.add(src);
        q.add(src);


        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbr:g.adj[node]){
                if(!visited.contains(nbr)){
                    visited.add(nbr);
                    q.add(nbr);
                    dist[nbr]=dist[node]+1;
                    parent[nbr]=node;
                }
            }
        }
        return dist[dest];
    }
}
