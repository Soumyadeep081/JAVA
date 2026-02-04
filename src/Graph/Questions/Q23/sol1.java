package Graph.Questions.Q23;

import java.util.*;

public class sol1 {
    public static void main(String[] args) {
        //Using DFS:

        int[][]stones={{0,0},{0,1},{1,2},{2,1},{1,0},{2,2}};
        System.out.println(conutStones(stones));
    }
    public static int conutStones(int[][]stones){
    int maxRow = 0, maxCol = 0;
        for (int[] s : stones) {
        maxRow = Math.max(maxRow, s[0]);
        maxCol = Math.max(maxCol, s[1]);
    }

    int offset = maxRow + 1;
    int size = maxRow + maxCol + 2;

    List<Integer>[] adj = new ArrayList[size];
        for (int i = 0; i < size; i++) adj[i] = new ArrayList<>();

    boolean[] used = new boolean[size];

        for (int[] s : stones) {
        int r = s[0];
        int c = s[1] + offset;

        adj[r].add(c);
        adj[c].add(r);
        used[r] = true;
        used[c] = true;
    }

    boolean[] visited = new boolean[size];
    int components = 0;

        for (int i = 0; i < size; i++) {
        if (used[i] && !visited[i]) {
            dfs(adj, visited, i);
            components++;
        }
    }

        return stones.length - components;
}

private static void dfs(List<Integer>[] adj, boolean[] visited, int node) {
    visited[node] = true;
    for (int nbr : adj[node]) {
        if (!visited[nbr]) dfs(adj, visited, nbr);
    }
}
}
