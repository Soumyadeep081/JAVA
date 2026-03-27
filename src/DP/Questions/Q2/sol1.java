package DP.Questions.Q2;

import java.util.Arrays;

public class sol1 {
    public static void main(String[] args) {
        //Using Memoization: Gives TLE
       int height[] = {20, 30, 40, 20};
        int n=height.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println( f(n-1,height,dp));
    }
    private static int f(int n,int[]height,int[]dp){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int left=f(n-1,height,dp)+Math.abs(height[n]-height[n-1]);
        int right=left;
        if(n>1){
            right=f(n-2,height,dp)+Math.abs(height[n-2]-height[n]);
        }
        return dp[n]=Math.min(left,right);
    }
}
