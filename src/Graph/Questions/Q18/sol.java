package Graph.Questions.Q18;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        int n = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        System.out.println(f(n, prerequisites));
    }

    public static boolean f(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] indegree = new int[numCourses];
        for (int[] arr : prerequisites) {
            graph[arr[1]].add(arr[0]);
            indegree[arr[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i);
        }
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            i++;
            for (int nbr : graph[node]) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) q.add(nbr);
            }
        }
        if (i != numCourses) return false;
        return true;
    }
}
