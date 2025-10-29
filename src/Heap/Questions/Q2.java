package Heap.Questions;

import java.util.*;

public class Q2 {
    static class Pair{
        int dist;
        int value;
        public Pair(int value,int dist){
            this.value=value;
            this.dist=dist;
        }
    }
    public static void main(String[] args) {
        //Find K Closest Elements:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int k=input.nextInt();
        int x=input.nextInt();

        System.out.println(f(arr,x,k));
    }
    public static List<Integer>f(int[]arr,int x,int k){
        PriorityQueue<Pair>maxHeap=new PriorityQueue<>((a,b)->{
            if(a.dist==b.dist)return b.value-a.value;
            return b.dist-a.dist;
        });

        for(int num:arr){
            int dist=Math.abs(num-x);
            maxHeap.add(new Pair(num,dist));
            if(maxHeap.size()>k)maxHeap.poll();
        }

        List<Integer>ll=new ArrayList<>();

        for(int i=0;i<k;i++){
            ll.add(maxHeap.poll().value);
        }

        Collections.sort(ll);
        return ll;
    }
}
