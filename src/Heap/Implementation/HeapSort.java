package Heap.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        heapSort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void heapSort(int[]a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }

        for(int i=n-1;i>=0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(a,i,0);
        }
    }
    private static void heapify(int[]a,int n,int i){
        int largest=i;
        int left=2*i+1,right=2*i+2;
        if(left<n&&a[left]>a[largest]){
            largest=left;
        }
        if(right<n&&a[right]>a[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n,largest);
        }
    }
}
