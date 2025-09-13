package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        //Printing Subsequences whose sum is k:
        int[]a={1,2,1};
        List<Integer>ll=new ArrayList<>();
        int k=2;
        f(a,0,ll,k);

        List<Integer>ll2=new ArrayList<>();
        fun(a,k,0,0,ll);
    }
    //1.
    private static void f(int[]a, int i, List<Integer>ll,int x){
        if(i==a.length){
            if(check(ll,x,0,0)){
                System.out.println(ll);

            }
            return;
        }
        ll.add(a[i]);
        f(a,i+1,ll,x);
        ll.removeLast();
        f(a,i+1,ll,x);
    }
    private static boolean check(List<Integer>ll,int x,int i,int sum){
        if(i== ll.size()){
            return (sum==x);
        }
        sum=sum+ll.get(i);
       return check(ll,x,i+1,sum);
    }
//-------------------------------------------------------------------------------------------

    //2.
    private static void fun(int[]a,int x,int i,int sum,List<Integer>ll){
        if(i==a.length){
            if(sum==x) System.out.println(ll);
            return;
        }
        ll.add(a[i]);
        fun(a,x,i+1,sum+a[i],ll);
        ll.removeLast();
        fun(a,x,i+1,sum,ll);
    }
}
