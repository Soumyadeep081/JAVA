package Graph.Implementation.ShortestPath.SingleSourceShortestPath.Dijkstra;

import java.util.*;

public class InDirected {
    static class pair{
        int node;
        int dist;
        pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public static void main(String[] args) {
        int V=6,E=7;
        int[][] edges = {
                {0, 1, 2},
                {0, 4, 1},
                {4, 5, 4},
                {4, 2, 2},
                {1, 2, 3},
                {2, 3, 6},
                {5, 3, 1}
        };

        System.out.println(f(edges,V,E));
    }
    public static int[] f(int[][]edges,int V,int E){
        int src=0;
        @SuppressWarnings("unchecked")
        List<pair>[]adj=new ArrayList[V];
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj[u].add(new pair(v,w));
        }
        int[]dist=new int[V];
        dist[src]=0;
        for(int i=1;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<pair>q=new PriorityQueue<>((a,b)->a.dist-b.dist);
        q.add(new pair(src,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            int node=p.node;
            int dis=p.dist;
            if(dis>dist[node])continue;
            for(pair ll:adj[node]){
                int nbr=ll.node;
                int wt=ll.dist;
                if(dist[nbr]>dist[node]+wt){
                    dist[nbr]=dist[node]+wt;
                    q.add(new pair(nbr,dist[nbr]));
                }
            }
        }
        for(int i=1;i<V;i++){
            if(dist[i]==Integer.MAX_VALUE)dist[i]=-1;
        }
        return dist;
    }
}
