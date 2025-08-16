package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Enter array size");
         int n=input.nextInt();
         int[]a=new int[n];
         System.out.println("enter array elements");
         for(int i=0;i<n;i++){
             a[i]=input.nextInt();
         }
         System.out.println("enter searching element");
         int x=input.nextInt();
         int sol=bs(a,x);
         if(sol==-1) System.out.println("Search Unsuccesful");
         else System.out.println("Found at pos="+sol);

    }
    private static int bs(int[]a,int x) {
        if (a.length < 1) return -1;

        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) return mid + 1;
            else if (a[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

}
