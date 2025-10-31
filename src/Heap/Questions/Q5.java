package Heap.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q5 {
    static class pair{
        int num;
        int freq;
        pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
    public static void main(String[] args) {
        //Top K Frequent Elements:

        int[]a={1,2,1,2,1,2,3,1,3,2};
        int k=2;

        System.out.println(Arrays.toString(topKFrequent(a,k)));

    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        PriorityQueue<pair>minHeap=new PriorityQueue<>((a, b)->a.freq - b.freq);
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            minHeap.add(new pair(entry.getKey(),entry.getValue()));
            if(minHeap.size()>k)minHeap.poll();
        }

        int[]res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=minHeap.poll().num;
        }
        return res;

    }
}
