package Graph.Questions.Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dfsSol {
    public static void main(String[] args) {
        List<List<Integer>>rooms=new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));

        System.out.println(f(rooms));


    }
    public static boolean f(List<List<Integer>>rooms){
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms, visited, 0);
        for (boolean visit : visited) {
            if (!visit)
                return false;
        }

        return true;
    }

    private static void dfs(List<List<Integer>> adjList, boolean[] visited, int node) {
        visited[node] = true;
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(adjList, visited, neighbor);
            }
        }
    }

}
