package Graph.Questions.Q28;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        int[][]times={{2,1,1},{2,3,1},{3,4,1}};
        int n=4;
        int k=2;

        System.out.println(networkDelayTime(times,n,k));
    }
    public static int networkDelayTime(int[][] times, int n, int k) {
        int[]dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        List<int[]>[]adj=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[]time:times){
            int u=time[0],v=time[1],w=time[2];
            adj[u].add(new int[]{v,w});
        }
        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        q.add(new int[]{k,0});
        while(!q.isEmpty()){
            int[]cell=q.poll();
            int node=cell[0];
            int dis=cell[1];
            if(dis>dist[node])continue;
            for(int[]nbrs:adj[node]){
                int nbr=nbrs[0];
                int wt=nbrs[1];
                int newDis=dis+wt;
                if(dist[nbr]>newDis){
                    dist[nbr]=newDis;
                    q.add(new int[]{nbr,dist[nbr]});
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}
