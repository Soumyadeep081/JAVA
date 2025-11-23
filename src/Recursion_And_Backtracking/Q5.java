package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        //Printing all subsequences of an array:

        int[]a={1,2,3};
        String s="";
        List<String>res=new ArrayList<>();
        f(a,0,3,s,res);
        System.out.println(res);


        List<Integer>ll=new ArrayList<>();
        fun(a,0,ll);



    }
    private static void f(int[]a, int i, int n,String s,List<String>res){
        if(i==n){
            res.add(s);
            return;
        }
        f(a,i+1,n,s+a[i],res);
         f(a,i+1,n,s,res);
         res.remove("");

    }
//-------------------------------------------------------------------------------------
    private static void fun(int[]a,int i,List<Integer>ll){
        if(i==a.length){
            System.out.println(ll);
            return;
        }
        ll.add(a[i]);
        fun(a,i+1,ll);
        ll.removeLast();
        fun(a,i+1,ll);

    }
}
