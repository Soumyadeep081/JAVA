package Graph.Implementation.ShortestPath.SingleSourceShortestPath.Dijkstra;

import java.util.*;

public class InUndirected {
    public static void main(String[] args) {
        int[][] edges = {
                {1, 2, 2},
                {2, 5, 5},
                {2, 3, 4},
                {1, 4, 1},
                {4, 3, 3},
                {3, 5, 1}
        };
        System.out.println(shortestPath(5,6,edges));
    }
    static class pair{
        int node;
        int dist;
        pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public static List<Integer> shortestPath(int V, int E, int edges[][]) {

        @SuppressWarnings("unchecked")
        List<pair>[]adj=new ArrayList[V+1];
        for(int i=1;i<=V;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[]edge:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            adj[u].add(new pair(v,w));
            adj[v].add(new pair(u,w));
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.add(new pair(1,0));
        int[]dist=new int[V+1];
        int[] parent = new int[V + 1];
        for (int i = 1; i <= V; i++) parent[i] = i;
        dist[1]=0;
        for(int i=2;i<=V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int node=p.node;
            int dis=p.dist;
            if(dis>dist[node])continue;
            for(pair p2:adj[node]){
                int nbr=p2.node;
                int wt=p2.dist;
                if(dist[nbr]>dist[node]+wt){
                    dist[nbr]=dist[node]+wt;
                    parent[nbr] = node;
                    pq.add(new pair(nbr,dist[nbr]));
                }
            }
        }

        if (dist[V] == Integer.MAX_VALUE) {
            return Arrays.asList(-1);
        }

        List<Integer> path = new ArrayList<>();
        int cur = V;
        while (parent[cur] != cur) {
            path.add(cur);
            cur = parent[cur];
        }
        path.add(1);
        Collections.reverse(path);

        path.add(0, dist[V]);

        return path;

    }
}
