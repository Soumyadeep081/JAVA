package Searching;

import java.util.Scanner;

public class LinearSearch {
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
             int sol=ls(a,x);
             if(sol==-1) System.out.println("Search unsuccessful");
             else System.out.println("search successful. Pos="+sol);
         }
         public static int ls(int[]a ,int x){
             if(a.length<1) return -1;
             for(int i=0;i<a.length;i++){
                     if(a[i]==x) return i+1;
                 }
             return -1;
         }

}
