package Heap.Questions;

import java.util.PriorityQueue;

public class Q10 {
    public static void main(String[] args) {
        //Kth Largest Element in a Stream:

        int[]a={4,5,8,2};
        int k=3;

        KthLargest obj=new KthLargest(a,k);
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
    static class KthLargest{
        int k;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        public KthLargest(int[]nums,int k){
            this.k=k;
            for(int num:nums){
                pq.add(num);
                if(pq.size()>k)pq.poll();
            }
        }
        public int add(int val){
            pq.add(val);
            if(pq.size()>k)pq.poll();
            return pq.peek();
        }
    }
}
