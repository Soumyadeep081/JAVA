package Heap.Questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q4 {
    static class pair{
        int i,j;
        double ratio;
        pair(int i,int j,int[]a){
            this.i=i;
            this.j=j;
            this.ratio=(double) a[i]/a[j];
        }
    }
    public static void main(String[] args) {
        //K-th Smallest Prime Fraction:

        int[]a={1,2,3,5};
        int k=3;

        System.out.println(Arrays.toString(f(a,k)));

    }
    public static int[] f(int[]arr,int k) {
        PriorityQueue<pair> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.ratio, a.ratio));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                maxHeap.add(new pair(i, j, arr));
                if (maxHeap.size() > k) maxHeap.poll();
            }
        }
        int[] res = new int[2];
        pair p = maxHeap.poll();
        res[0] = arr[p.i];
        res[1] = arr[p.j];

        return res;


    }
}
