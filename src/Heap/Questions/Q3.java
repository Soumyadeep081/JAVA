package Heap.Questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q3 {
    public static void main(String[] args) {
        //Merge two binary MaxHeap:

        int[]a={10,5,6,2};
        int[]b={12,7,9};

        int[]merged=new int[a.length+b.length];
        System.arraycopy(a,0,merged,0,a.length);
        System.arraycopy(b,0,merged,a.length,b.length);

        //Approach 1:
        buildHeap(merged);
        System.out.println(Arrays.toString(merged));

        //Approach 2:
        System.out.println(Arrays.toString(f(a,b)));
    }

    //Approach 1: merging both heaps and then down heapifying them:
    public static void buildHeap(int[]a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    private static void heapify(int[]a,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n&&a[left]>a[largest])largest=left;
        if(right<n&&a[right]>a[largest])largest=right;

        if(i!=largest){
            int temp=a[largest];
            a[largest]=a[i];
            a[i]=temp;

            heapify(a,n,largest);
        }
    }

    //Approach 2:Built in function:
    private static int[] f(int[]a,int[]b){
        PriorityQueue<Integer>merged=new PriorityQueue<>((A,B)->B - A);

        for(int num:a)merged.add(num);
        for(int num:b)merged.add(num);

        int[]res=new int[a.length+b.length];
        for(int i=0;i<a.length+b.length;i++){
            res[i]=merged.poll();
        }
        return res;
    }
}
