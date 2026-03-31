package DP.Questions.Q9;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        //Memoization:

        int[][]grid={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(grid));
    }
    static int[][]dirs={{0,1},{1,0}};
    public static int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return f(grid,0,0,dp,m,n);
    }
    private static int f(int[][]grid,int r,int c,int[][]dp,int m,int n){
        if(r==m-1&&c==n-1&&grid[r][c]!=1)return 1;
        if(dp[r][c]!=-1)return dp[r][c];
        if(r==m||c==n||grid[r][c]==1)return 0;
        int ans=0;
        for(int[]dir:dirs){
            ans+=f(grid,r+dir[0],c+dir[1],dp,m,n);
        }
        return dp[r][c]=ans;
    }
}
