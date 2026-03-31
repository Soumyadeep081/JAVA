package DP.Questions.Q8;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(uniquePaths(m,n));
    }
    static int[][]dirs={{0,1},{1,0}};
    public static int uniquePaths(int m, int n) {
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return f(0,0,m,n,dp);

    }
    private static int f(int r,int c,int m,int n,int[][]dp){
        if(r==m-1&&c==n-1){
            return 1;
        }
        if(dp[r][c]!=-1)return dp[r][c];
        if(r==m||c==n)return 0;
        int ans=0;
        for(int[]dir:dirs){
            ans+=f(r+dir[0],c+dir[1],m,n,dp);
        }
        return dp[r][c]=ans;
    }

}
