package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        //Reverse an array using recursion:

        int[]a={1,2,3,4,5};
        List<Integer>ll=new ArrayList<>();
        fun(a,ll,0);
        System.out.println(ll);

        f(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    //Approach 1: Not in place:
    private static void fun(int[]a,List<Integer>ll,int i){
        if(i==a.length) return;
        fun(a,ll,i+1);
        ll.add(a[i]);
    }


    //Approach 2: In place:
    private static void f(int[]a,int left,int right){
        if(left>=right) return;
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
        f(a,left+1,right-1);
    }


}
