package Heap.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Q12 {
    public static void main(String[] args) {
        //Find K Pairs with Smallest Sums:
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 8};
        int k = 3;

        System.out.println(kSmallestPairs(nums1, nums2, k));

        System.out.println(kSmallestPairs2(nums1,nums2,k));

    }

    //Approach 1: Brute Force: Gives TLE for large arrays
    static class pair {
        int x;
        int y;
        int sum;

        public pair(int x, int y) {
            this.x = x;
            this.y = y;
            sum = x + y;
        }
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.sum - a.sum);
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                pq.add(new pair(num1, num2));
                if (pq.size() > k) pq.poll();
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            pair p = pq.poll();
            res.add(Arrays.asList(p.x, p.y));
        }
        return res;
    }

    //Approach 2: Efficient:
    static class Pair2 {
        int i, j, sum;

       public Pair2(int i, int j, int[] a, int[] b) {
            this.i = i;
            this.j = j;
            this.sum = a[i] + b[j];
        }
    }

    public static List<List<Integer>> kSmallestPairs2(int[] a, int[] b, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (a.length == 0 || b.length == 0 || k == 0) return res;
        PriorityQueue<Pair2> pq = new PriorityQueue<>((x, y) -> x.sum - y.sum);
        for (int i = 0; i < Math.min(a.length, k); i++) pq.offer(new Pair2(i, 0, a, b));
        while (k-- > 0 && !pq.isEmpty()) {
            Pair2 p = pq.poll();
            res.add(Arrays.asList(a[p.i], b[p.j]));
            if (p.j + 1 < b.length) pq.offer(new Pair2(p.i, p.j + 1, a, b));
        }
        return res;
    }
}
