package Graph.Questions.Q22;

import java.util.ArrayList;
import java.util.List;

public class sol1 {
    public static void main(String[] args) {
        //Using dfs:
        int n=4;
        int[][]connections={{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(n,connections));
    }
    public static int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length)return -1;
        List<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[]edge:connections){
            int u=edge[0],v=edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        int c=0;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                f(adj,visited,i);
                c++;
            }
        }
        return c-1;
    }
    private static void f(List<Integer>[]adj,boolean[]visited,int node){
        visited[node]=true;
        for(int nbr:adj[node]){
            if(!visited[nbr]){
                f(adj,visited,nbr);
            }
        }
    }
}
