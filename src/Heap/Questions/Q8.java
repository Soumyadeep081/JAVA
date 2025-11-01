package Heap.Questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q8 {
    static class Pair{
        int[]point;
        double dist;
        public Pair(int[]point){
            this.point=point;
            dist=(point[0]*point[0]+point[1]*point[1]);
        }
    }
    public static void main(String[] args) {
        // K Closest Points to Origin:
        int[][]a={{1,3},{-2,2}};
        int k=1;

        System.out.println(Arrays.deepToString(f(a,k)));

    }
    public static int[][] f(int[][]arr,int k){
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Double.compare(b.dist,a.dist));
        for(int[]point:arr){
            pq.add(new Pair(point));
            if(pq.size()>k)pq.poll();
        }

        int[][]res=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            res[i++]=pq.poll().point;
        }
        return res;
    }
}
