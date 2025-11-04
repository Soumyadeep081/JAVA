package Heap.Questions;

import java.util.*;

public class Q11 {
    static class pair{
        int value;
        int freq;
        public pair(int value,int freq){
            this.value=value;
            this.freq=freq;

        }
    }
    public static void main(String[] args) {
        //Find X-Sum of All K-Long Subarrays I:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int k=input.nextInt();
        int x=input.nextInt();

        System.out.println(Arrays.toString(findXSum(a,k,x)));

    }
    public static int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[]res=new int[n-k+1];
        int i=0;
        int left=0,right=k-1;
        while(right<n){
            res[i++]=f(nums,left,right,x);
            left++;
            right++;
        }
        return res;
    }
    private static int f(int[]a,int start,int end,int x){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=start;i<=end;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((p, q)->{
            if(p.freq==q.freq)return q.value - p.value;
            return q.freq - p.freq;
        });

        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
        }
        int sum=0;
        for(int i=0;i<x&& !pq.isEmpty();i++){
            pair p2=pq.poll();
            sum+=p2.value*p2.freq;
        }
        return sum;


    }

}
