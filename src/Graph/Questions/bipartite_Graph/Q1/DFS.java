package Graph.Questions.bipartite_Graph.Q1;

import java.util.Arrays;

public class DFS {
    public static void main(String[] args) {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(f(graph));
    }
    private static boolean f(int[][]graph){
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(color,0,i,graph))return false;
            }
        }
        return true;
    }
    private static boolean dfs(int[]color,int c,int node,int[][]graph){
        color[node]=c;
        for(int nbr:graph[node]){
            if(color[nbr]==-1){
                if(!dfs(color,c^1,nbr,graph))return false;
            }
            else if(color[nbr]==c)return false;
        }
        return true;
    }
}

