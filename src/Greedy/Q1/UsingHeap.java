package Greedy.Q1;

import java.util.PriorityQueue;

public class UsingHeap {
    public static void main(String[] args) {
        int[]a={4,2,3};
        int k=1;
        System.out.println(f(a,k));
    }
    public static int f(int[]a,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int j : a) {
            pq.add(j);
        }
        while(k-->0){
            int num=pq.poll();
            pq.add(-num);
        }
        int sum=0;
        for (int n : pq) sum += n;
        return sum;
    }
}
