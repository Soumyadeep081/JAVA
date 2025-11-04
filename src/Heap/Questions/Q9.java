package Heap.Questions;

import java.util.PriorityQueue;

public class Q9 {
    public static void main(String[] args) {
        //Maximum difference between two subsets of m elements:

        int[]a={1,2,3,4,5};
        int m=4;

        System.out.println(f(a,m));
    }

    public static int f(int[]arr,int m){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)->b - a);
        for(int num:arr){
            minHeap.add(num);
            maxHeap.add(num);
            if(minHeap.size()>m)minHeap.poll();
            if(maxHeap.size()>m)maxHeap.poll();
        }
        int s1=0,s2=0;

        while(!minHeap.isEmpty()){
            s1+=minHeap.poll();
        }
        while(!maxHeap.isEmpty()){
            s2+=maxHeap.poll();
        }
        return s1-s2;
    }
}
