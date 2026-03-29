package DP.Questions.Q4;

import java.util.Arrays;

public class sol1 {
    public static void main(String[] args) {
        //Using Memoization:

        int[]heights={10, 5, 20, 0, 15};
        int k=2;

        int n=heights.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        System.out.println(f(heights,k,dp,n-1));
    }
    private static int f(int[]heights,int k,int[]dp,int i){
        if(i==0)return 0;
        if(dp[i]!=-1)return dp[i];

        int min=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                int jump=f(heights,k,dp,i-j)+Math.abs(heights[i]-heights[i-j]);
                min=Math.min(min,jump);
            }
        }
        return dp[i]=min;
    }
}
