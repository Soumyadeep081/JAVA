package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
    public static void main(String[] args) {
        //Combination Sum:
        int[]c={2,3,4,7};
        int t=7;
        List<List<Integer>>out=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        f(c,t,ll,out,0,0);
        System.out.println(out);
    }

    private static void f(int[]c, int t, List<Integer> ll, List<List<Integer>>out, int sum, int i){
        if(sum==t){
            out.add(new ArrayList<>(ll));
            return;
        }
        if(sum>t||i==c.length)return;
        ll.add(c[i]);
        f(c,t,ll,out,sum+c[i],i);
        ll.removeLast();
        f(c,t,ll,out,sum,i+1);
    }
}
