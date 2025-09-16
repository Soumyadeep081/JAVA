package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        //Combination Sum ||:
        int[]c={4,3,6,7};
        int t=7;
        Arrays.sort(c);
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>out=new ArrayList<>();
        f(c,t,ll,out,0,0);
        System.out.println(out);
    }
    private static void f(int[]c,int t,List<Integer>ll,List<List<Integer>>out,int i,int sum){
        if(sum==t){
            out.add(new ArrayList<>(ll));
            return;

        }
        if(sum>t||i==c.length) return;
        for(int j=i;j<c.length;j++){
            if(j>i&&c[j]==c[j-1]) continue;
            ll.add(c[j]);
            f(c,t,ll,out,j+1,sum+c[j]);
            ll.removeLast();
        }
    }
}
