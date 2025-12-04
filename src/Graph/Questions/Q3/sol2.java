package Graph.Questions.Q3;

import java.util.*;

public class sol2 {
    public static void main(String[] args) {
        int[][]edges={{0,1},{1,2},{2,0}};
        System.out.println(f(3,edges,0,2));
    }
    public static boolean f(int n,int[][]edges,int src,int dest){
        if(src==dest)return true;

        @SuppressWarnings("unchecked")
        List<Integer>[]adj=new ArrayList[n];
        for (int i=0;i<n;i++)adj[i]=new ArrayList<>();

        for(int[]edge:edges){
            int u=edge[0],v=edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        boolean[] visited=new boolean[n];
        int[]dist=new int[n];
        int[]parent=new int[n];
        Queue<Integer>q=new LinkedList<>();

        visited[src]=true;
        q.add(src);
        Arrays.fill(parent,-1);

        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbr:adj[node]){
                if(!visited[nbr]){
                    visited[nbr]=true;
                    q.add(nbr);
                    dist[nbr]=dist[node]+1;
                    parent[nbr]=node;
                }
            }
        }
        return visited[dest];
    }
}
