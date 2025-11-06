package Heap.Questions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        //Kth Smallest Element in a Sorted Matrix:

        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        int m=input.nextInt();
        int[][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=input.nextInt();
            }
        }
        int k=input.nextInt();

        System.out.println(f(a,k));


    }
    public static int f(int[][]matrix,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b - a);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k)pq.poll();
            }
        }
        return pq.poll();
    }
}
