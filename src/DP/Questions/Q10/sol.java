package DP.Questions.Q10;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[][]grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    static int[][]dirs={{0,1},{1,0}};
    public static int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) Arrays.fill(dp[i],-1);
        return f(grid,0,0,dp);
    }
    private static int f(int[][]grid,int r,int c,int[][]dp){

        if(r==grid.length-1&&c==grid[0].length-1)return grid[r][c];
        if(dp[r][c]!=-1)return dp[r][c];
        int min=Integer.MAX_VALUE;
        for(int[]dir:dirs){
            int newR=r+dir[0];
            int newC=c+dir[1];
            if(newR<grid.length&&newR>=0&&newC<grid[0].length&&newC>=0){
                int ans=grid[r][c]+f(grid,newR,newC,dp);
                min=Math.min(min,ans);
            }

        }
        return dp[r][c]=min;
    }

}
