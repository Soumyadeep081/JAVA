package Graph.Implementation.Topological_Sort;
import Graph.Implementation.AdjacencyList;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        AdjacencyList.Graph g=new AdjacencyList.Graph(6);
        g.addEdge(0,1,false);
        g.addEdge(0,2,false);
        g.addEdge(1,3,false);
        g.addEdge(1,4,false);
        g.addEdge(2,3,false);
        g.addEdge(2,5,false);
        g.addEdge(4,5,false);

        topoSort(6,g);

    }
    public static void topoSort(int V,AdjacencyList.Graph g) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, g.adj, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static void dfs(int node, List<Integer>[] adj, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;

        for (int nbr : adj[node]) {
            if (!visited[nbr]) {
                dfs(nbr, adj, visited, stack);
            }
        }

        stack.push(node);
    }
}
