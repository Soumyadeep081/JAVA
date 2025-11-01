package Heap.Questions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //Connect n ropes with minimum cost:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        System.out.println(f(a));
    }

    public static int f(int[]a) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : a) {
            minHeap.add(num);
        }
        int total=0;
        while(minHeap.size()>1){
            int first=minHeap.poll();
            int second=minHeap.poll();
            int sum=first+second;
            total+=sum;
            minHeap.add(sum);
        }
        return total;
    }
}
