package Recursion_And_Backtracking;

import java.util.*;

public class Q28 {
    public static void main(String[] args) {
        //Coin Change:(Gives TLE)
        int[]coins={1,2,5};
        int amount=11;

        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        min=Integer.MAX_VALUE;
        f(coins,amount,0,0, new ArrayList<>());
        return min==Integer.MAX_VALUE?-1:min;
    }
    static int min;
    private static void f(int[]a,int t,int i,int sum,List<Integer>ll){
        if(sum==t){
            min=Math.min(min,ll.size());
            return;
        }
        if(sum>t||i==a.length)return;

        for(int j=i;j<a.length;j++){
            ll.add(a[j]);
            f(a,t,j,sum+a[j],ll);
            ll.removeLast();
        }
    }
}
