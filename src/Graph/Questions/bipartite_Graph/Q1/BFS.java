package Graph.Questions.bipartite_Graph.Q1;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(f(graph));
    }

    private static boolean f(int[][] graph) {
        int V=graph.length;
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!bfs(i, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean bfs(int src, int[][]adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        color[src] = 0;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u]) {
                if (color[v] == -1) {
                    color[v] = 1 - color[u];
                    q.add(v);
                } else if (color[v] == color[u]) {
                    return false;
                }
            }
        }
        return true;
    }
}
