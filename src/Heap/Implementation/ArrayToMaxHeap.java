package Heap.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToMaxHeap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        BuildHeap(a);
        //O(n) time complexity
        System.out.println(Arrays.toString(a));

    }
    public static void BuildHeap(int[]a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    private static void heapify(int[]a,int n,int i){
        int greatest=i;
        int left=2*i+1,right=2*i+2;
        if(left<n&&a[left]>a[greatest]){
            greatest=left;
        }
        if(right<n&&a[right]>a[greatest]){
            greatest=right;
        }

        if(greatest!=i){
            int temp=a[greatest];
            a[greatest]=a[i];
            a[i]=temp;

            heapify(a,n,greatest);
        }
    }
}
