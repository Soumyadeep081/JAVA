package Greedy.Q2;

import java.util.ArrayList;
import java.util.List;

public class BruteForce {
    public static void main(String[] args) {
        //Generating all subsets and finding the minimum product:
        //Gives TLE for large arrays.

        int[]a={-1,-1,-2,3,4};
        int n=5;

        System.out.println(f(a,n));
    }
    public static int f(int[]a,int n){
        if(n==1)return a[0];
        List<List<Integer>>out=new ArrayList<>();
        subset(a,0,new ArrayList<>(),out);

        int min=Integer.MAX_VALUE;
        for(List<Integer>ll:out){
            if(!ll.isEmpty()) {
                min = Math.min(min, pro(ll));
            }
        }
        return min;
    }
    private static void subset(int[]a, int i, List<Integer>ll,List<List<Integer>>out){
        if(i==a.length){
            out.add(new ArrayList<>(ll));
            return;
        }
        ll.add(a[i]);
        subset(a,i+1,ll,out);
        ll.removeLast();
        subset(a,i+1,ll,out);
    }
    private static int pro(List<Integer>ll){
        int p=1;
        for(int n:ll)p*=n;
        return p;
    }
}
