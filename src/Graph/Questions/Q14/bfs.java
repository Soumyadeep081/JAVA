package Graph.Questions.Q14;

import java.util.*;

public class bfs {
    public static void main(String[] args) {
        int V=4;
        int[][]edges={{0,1},{0,2},{1,2},{2,3}};
        System.out.println(isCycle(V,edges));
    }

    public static boolean isCycle(int V, int[][] edges) {

        @SuppressWarnings("unchecked")
        List<Integer>[]adj=new ArrayList[V];
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }
        boolean[]visited=new boolean[V];
        for(int[]edge:edges){
            int u=edge[0],v=edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(f(adj,i,visited))return true;;
            }
        }
        return false;
    }
    private static boolean f(List<Integer>[]adj,int src,boolean[]visited){
        visited[src]=true;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{src,-1});
        while(!q.isEmpty()){
            int[]cell=q.poll();
            int node=cell[0];
            int parent=cell[1];
            for(int nbr:adj[node]){
                if(!visited[nbr]){
                    visited[nbr]=true;
                    q.add(new int[]{nbr,node});

                }
                else if(parent!=nbr)return true;
            }
        }
        return false;
    }
}
