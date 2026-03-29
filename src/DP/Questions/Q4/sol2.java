package DP.Questions.Q4;

import java.util.Arrays;

public class sol2 {
    public static void main(String[] args) {
        //Using Tabulation:
        int[]heights={10, 5, 20, 0, 15};
        int k=2;

        int n=heights.length;
        int[] dp=new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump=Math.abs(heights[i]-heights[i-j]);
                    dp[i]=Math.min(dp[i],dp[i-j]+jump);
                }
            }

        }
        System.out.println(dp[n-1]);
    }
}
