package Graph.Questions.Q14;

import java.util.*;

public class dfs {
    public static void main(String[] args) {
        int V=4;
        int[][]edges={{0,1},{0,2},{1,2},{2,3}};
        System.out.println(isCycle(V,edges));
    }
    public static boolean isCycle(int V, int[][] edges) {
        @SuppressWarnings("unchecked")
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) adj[i] = new ArrayList<>();

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[V];
        for (int i=0;i<V;i++){
            if (!visited[i] && f(i, -1, visited, adj)) return true;
        }
        return false;
    }

    private static boolean f(int node, int parent, boolean[] visited, List<Integer>[] adj) {
        visited[node] = true;
        for (int nbr : adj[node]) {
            if (!visited[nbr]) {
                if (f(nbr, node, visited, adj)) return true;
            } else if (nbr != parent) return true;
        }
        return false;
    }

}
