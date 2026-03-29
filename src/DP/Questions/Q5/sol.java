package DP.Questions.Q5;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        //Using Memoization:

        int[]nums={2,7,9,3,1};

        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);

        System.out.println(f(nums,0,dp));

    }
    private static int f(int[]nums,int i,int[]dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int curr=nums[i]+f(nums,i+2,dp);
        int skip=f(nums,i+1,dp);
        return dp[i]=Math.max(skip,curr);
    }
}
