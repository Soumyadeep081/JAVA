package DP.Questions.Q1;

import java.util.Arrays;

public class sol1 {
    public static void main(String[] args) {
        //Using Memoization:
        //TC=O(n), SC=O(2n) (Call stack space)
        int n=5;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<=n;i++) System.out.print(f(i,dp)+" ");
    }
    public static int f(int n,int[]dp){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=f(n-1,dp)+f(n-2,dp);

    }
}
