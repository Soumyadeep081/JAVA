package DP.Questions.Q6;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[]nums={1,7,9,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        int one=f(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int two=f(nums,1,n,dp);
        return Math.max(one,two);
    }
    private static int f(int[]nums,int start,int end,int[]dp){
        if(start>=end)return 0;
        if(dp[start]!=-1)return dp[start];
        int curr=nums[start]+f(nums,start+2,end,dp);
        int skip=f(nums,start+1,end,dp);
        return dp[start]=Math.max(curr,skip);
    }
}
