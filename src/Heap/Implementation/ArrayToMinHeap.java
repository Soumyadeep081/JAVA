package Heap.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToMinHeap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        BuildHeap(a);

        System.out.println(Arrays.toString(a));
    }
    public static void BuildHeap(int[]a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    private static void heapify(int[]a,int n,int i){
        int lowest=i;
        int left=2*i+1,right=2*i+2;

        if(left<n&&a[left]<a[lowest]){
            lowest=left;
        }
        if(right<n&&a[right]<a[lowest]){
            lowest=right;
        }

        if(i!=lowest){
            int temp=a[i];
            a[i]=a[lowest];
            a[lowest]=temp;

            heapify(a,n,lowest);
        }
    }
}
