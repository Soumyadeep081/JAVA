package Graph.Questions.Q11;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        int[][]isConnected={{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(f(isConnected));
    }
    public static int f(int[][]isConnected){
        int n=isConnected.length;
        int c=0;
        Set<Integer>visited=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfs(isConnected,i,visited);
                c++;
            }
        }
        return c;
    }
    private static void dfs(int[][]a,int src,Set<Integer>visited){
        visited.add(src);
        for(int i=0;i<a.length;i++){
            if(a[src][i]==1&&!visited.contains(i)){
                dfs(a,i,visited);
            }
        }
    }
}
