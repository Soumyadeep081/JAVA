package Graph.Questions.Q3;

import java.util.*;

public class sol1 {
    static class graph{
        int v;
        LinkedList<Integer>[]adj;
        public graph(int v){
            this.v=v;
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<>();
            }
        }
        public void addEdge(int u,int v,boolean bidir){
            adj[u].add(v);
            if(bidir)adj[v].add(u);
        }
    }
    public static void main(String[] args) {
        //Creating an adjacency list first then finding path from src to dest:

        int[][]edges={{0,1},{1,2},{2,0}};

        System.out.println(validPath(3,edges,0,2));

    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        graph g=new graph(n);
        for(int[]edge:edges){
            g.addEdge(edge[0],edge[1],true);
        }

        Set<Integer>visited=new HashSet<>();
        visited.add(source);
        return f(g,source,destination,visited);
    }
    public static boolean f(graph g,int src,int dest,Set<Integer>visited){
        if(src==dest)return true;
        for(int neighbour:g.adj[src]){
            if(!visited.contains(neighbour)){
                visited.add(neighbour);
                if( f(g,neighbour,dest,visited))return true;
            }
        }
        return false;

    }

}
