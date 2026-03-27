package DP.Questions.Q2;

public class sol2 {
    public static void main(String[] args) {
        //Using tabulation:
        int height[] = {20, 30, 40, 20};
        int n=height.length;
        int[]dp=new int[n];
        dp[0]=0;

        System.out.println( f(n,height,dp));
    }
    private static int f(int n,int[]height,int[]dp){
        for(int i=1;i<n;i++){

            int left=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1){
                right=dp[i-2]+Math.abs(height[i]-height[i-2]);
            }
            dp[i]=Math.min(left,right);
        }
        return dp[n-1];
    }
}
