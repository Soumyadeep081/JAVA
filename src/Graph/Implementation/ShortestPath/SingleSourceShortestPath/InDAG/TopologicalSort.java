package Graph.Implementation.ShortestPath.SingleSourceShortestPath.InDAG;

import java.util.*;

public class TopologicalSort {
    static class Pair {
        int v, wt;
        Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        //Only valid if graph do not contain cycle and for DAG only.
        int V=6,E=7;
        int[][] edges = {
                {0, 1, 2},
                {0, 4, 1},
                {4, 5, 4},
                {4, 2, 2},
                {1, 2, 3},
                {2, 3, 6},
                {5, 3, 1}
        };

        System.out.println(Arrays.toString(f(edges,V,E)));
    }
    public static int[] f(int[][]edges,int V,int E){
        List<Pair>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) adj[i] = new ArrayList<>();

        for (int[] e : edges) {
            adj[e[0]].add(new Pair(e[1], e[2]));
        }


        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) dfs(i, adj, vis, st);
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        while (!st.isEmpty()) {
            int u = st.pop();
            if (dist[u] != Integer.MAX_VALUE) {
                for (Pair p : adj[u]) {
                    if (dist[p.v] > dist[u] + p.wt) {
                        dist[p.v] = dist[u] + p.wt;
                    }
                }
            }
        }

        for (int i = 0; i < V; i++)
            if (dist[i] == Integer.MAX_VALUE) dist[i] = -1;

        return dist;
    }

    static void dfs(int u, List<Pair>[] adj, boolean[] vis, Stack<Integer> st) {
        vis[u] = true;
        for (Pair p : adj[u]) {
            if (!vis[p.v]) dfs(p.v, adj, vis, st);
        }
        st.push(u);
    }

}
