package Graph.Questions.Q29;

import java.util.*;

public class sol1 {
    public static void main(String[] args) {
        //Brute Force:
        int n=4;
        int[][]edges={{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int distanceThreshold=4;

        System.out.println(findTheCity(n,edges,distanceThreshold));

    }
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<int[]>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[]edge:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            adj[u].add(new int[]{v,w});
            adj[v].add(new int[]{u,w});
        }

        int answer=-1;
        int minCount=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int[]dist=f(adj,i,n);
            int count=0;

            for(int j=0;j<n;j++){
                if(j!=i&&dist[j]<=distanceThreshold){
                    count++;
                }
            }

            if(count<minCount||(count==minCount&&i>answer)){
                minCount=count;
                answer=i;
            }
        }
        return answer;


    }
    public static int[] f(List<int[]>[]adj,int src,int n){
        int[]dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        q.add(new int[]{src,0});
        while(!q.isEmpty()){
            int[]cell=q.poll();
            int node=cell[0];
            int dis=cell[1];
            if(dis>dist[node])continue;
            for(int[]nbrs:adj[node]){
                int nbr=nbrs[0];
                int wt=nbrs[1];
                int newDis=dis+wt;
                if(newDis<dist[nbr]){
                    dist[nbr]=newDis;
                    q.add(new int[]{nbr,newDis});
                }
            }
        }
        return dist;

    }
}
