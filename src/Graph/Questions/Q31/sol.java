package Graph.Questions.Q31;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        int[][]richer={{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
        int[]quiet={3,2,5,4,6,1,7,0};

        System.out.println(Arrays.toString(loudAndRich(richer,quiet)));
    }
    public static int[] loudAndRich(int[][] richer, int[] quiet) {
        List<Integer>[]adj=new ArrayList[quiet.length];
        for(int i=0;i<quiet.length;i++){
            adj[i]=new ArrayList<>();
        }
        int[]indegree=new int[quiet.length];
        for(int[]rich:richer){
            int u=rich[0];
            int v=rich[1];
            adj[u].add(v);
            indegree[v]++;
        }
        int[] ans = new int[quiet.length];
        for (int i = 0; i < quiet.length; i++) {
            ans[i] = i;
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<quiet.length;i++){
            if(indegree[i]==0)q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbr:adj[node]){
                if(quiet[ans[node]]<quiet[ans[nbr]]){
                    ans[nbr]=ans[node];
                }
                indegree[nbr]--;
                if(indegree[nbr]==0)q.add(nbr);
            }
        }
        return ans;
    }
}
