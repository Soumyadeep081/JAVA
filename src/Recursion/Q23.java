package Recursion;

public class Q23 {
    public static void main(String[] args) {
        //M-coloring Problem:


        Q23 sol = new Q23();
        int v = 4;
        int[][] edges = {{0,1},{0,2},{0,3},{1,2},{2,3}};
        int m = 3;
        System.out.println(sol.graphColoring(v, edges, m) ? "Solution exists" : "No solution exists");
    }
            boolean graphColoring(int v, int[][] edges, int m) {
                int[][] graph = new int[v][v];
                for (int[] edge : edges) {
                    int a = edge[0], b = edge[1];
                    graph[a][b] = 1;
                    graph[b][a] = 1;
                }
                int[] color = new int[v];
                return solve(0, graph, color, m);
            }

            private boolean solve(int vertex, int[][] graph, int[] color, int m) {
                if (vertex == graph.length) return true;
                for (int c = 1; c <= m; c++) {
                    if (isSafe(vertex, graph, color, c)) {
                        color[vertex] = c;
                        if (solve(vertex + 1, graph, color, m)) return true;
                        color[vertex] = 0;
                    }
                }
                return false;
            }

            private boolean isSafe(int vertex, int[][] graph, int[] color, int c) {
                for (int i = 0; i < graph.length; i++)
                    if (graph[vertex][i] == 1 && color[i] == c) return false;
                return true;
            }



}
