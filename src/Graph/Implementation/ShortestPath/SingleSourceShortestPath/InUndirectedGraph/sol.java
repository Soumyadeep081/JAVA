package Graph.Implementation.ShortestPath.SingleSourceShortestPath.InUndirectedGraph;

import java.util.*;

public class sol {
    static class pair{
        int node;
        int dist;
        pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public static void main(String[] args) {
        int V=9;
        int[][] edges = {{0, 1}, {0, 3}, {1, 2}, {3, 4}, {4, 5}, {2, 6}, {5, 6}, {6, 7}, {6, 8}, {7, 8}};
        int src=0;
        System.out.println(Arrays.toString(f(edges,V,src)));
    }
    public static int[]f(int[][]edges,int V,int src){
        @SuppressWarnings("unchecked")
        List<Integer>[]adj=new ArrayList[V];
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[]edge:edges){
            int u=edge[0],v=edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        int[]distance=new int[V];
        distance[src]=0;
        for(int i=0;i<V;i++){
            if(i==src)continue;
            distance[i]=Integer.MAX_VALUE;
        }
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(src,distance[src]));

        while(!q.isEmpty()){
            pair p=q.poll();
            int node=p.node;
            for(int nbr:adj[node]){
                if(distance[nbr]>distance[node]+1){
                    distance[nbr]=distance[node]+1;
                    q.add(new pair(nbr,distance[nbr]));
                }
            }
        }
        for(int i=0;i<V;i++){
            if(distance[i]==Integer.MAX_VALUE)distance[i]=-1;
        }
        return distance;
    }
}
