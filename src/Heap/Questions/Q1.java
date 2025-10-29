package Heap.Questions;

import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        //Kth Largest Element in an Array:

        int[]nums={3,2,1,5,6,4};
        int k=2;

        System.out.println(f(nums,k));
    }
    private static int f(int[]nums,int k){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k)minHeap.poll();
        }
        return minHeap.peek();
    }
}
