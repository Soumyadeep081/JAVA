package Graph.Questions.Q19;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        int[][]graph={{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(eventualSafeNodes(graph));
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;

        List<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        int[]indegree=new int[n];

        for(int i=0;i<n;i++){
            for(int nbr:graph[i]){
                adj[nbr].add(i);
                indegree[i]++;
            }
        }

        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0)q.add(i);
        }

        List<Integer>res=new ArrayList<>();

        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int nbr:adj[node]){
                indegree[nbr]--;
                if(indegree[nbr]==0)q.add(nbr);
            }
        }
        Collections.sort(res);
        return res;
    }
}
