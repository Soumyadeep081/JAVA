package Graph.Questions.Q30;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        int[][]roads={{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};
        int n=7;

        System.out.println(countPaths(n,roads));

    }
    static final int MOD = 1_000_000_007;

    public static int countPaths(int n, int[][] roads) {

        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for (int[] r : roads) {
            adj[r[0]].add(new int[]{r[1], r[2]});
            adj[r[1]].add(new int[]{r[0], r[2]});
        }

        long[] dist = new long[n];
        long[] ways = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));

        pq.add(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            int node = (int) cur[0];
            long d = cur[1];

            if (d > dist[node]) continue;

            for (int[] nb : adj[node]) {
                int next = nb[0];
                long wt = nb[1];
                long nd = d + wt;

                if (nd < dist[next]) {
                    dist[next] = nd;
                    ways[next] = ways[node];
                    pq.add(new long[]{next, nd});
                } else if (nd == dist[next]) {
                    ways[next] = (ways[next] + ways[node]) % MOD;
                }
            }
        }

        return (int) ways[n - 1];
    }
}
