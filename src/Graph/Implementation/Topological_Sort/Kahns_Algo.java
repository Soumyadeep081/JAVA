package Graph.Implementation.Topological_Sort;
import Graph.Implementation.AdjacencyList;

import java.util.*;

public class Kahns_Algo {
    public static void main(String[] args) {
        AdjacencyList.Graph g=new AdjacencyList.Graph(6);
        g.addEdge(0,1,false);
        g.addEdge(0,2,false);
        g.addEdge(1,3,false);
        g.addEdge(1,4,false);
        g.addEdge(2,3,false);
        g.addEdge(2,5,false);
        g.addEdge(4,5,false);

        System.out.println(topoSort(g,6));
    }
    public static List<Integer> topoSort(AdjacencyList.Graph g,int v){
        List<Integer>res=new ArrayList<>();
        int[]inDegree=new int[v];
        for(int i=0;i<v;i++){
            for(int nbr:g.adj[i]){
                inDegree[nbr]++;
            }
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(inDegree[i]==0)q.add(i);
        }

        while (!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int nbr:g.adj[node]){
                inDegree[nbr]--;
                if(inDegree[nbr]==0)q.add(nbr);
            }
        }
        if(res.size()!=v){ //This means Graph has cycle.
            return new ArrayList<>();
        }

        return res;
    }
}
