package DP.Questions.Q7;

import java.util.Arrays;
import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        //Memoization:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[][]mat=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=input.nextInt();
            }
        }

        System.out.println(maxPoints(mat));
    }
    public static int maxPoints(int[][]mat){
        int n=mat.length;
        int[][]dp=new int[n][4];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return f(mat,0,3,dp);
    }
    private static int f(int[][]mat,int index,int last,int[][]dp){
        if(index==mat.length-1){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    max=Math.max(max,mat[index][last]);
                }
            }
            return max;
        }
        if(dp[index][last]!=-1)return dp[index][last];
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int curr=mat[index][last]+f(mat,index+1,i,dp);
                max=Math.max(max,curr);
            }
        }
        return dp[index][last]=max;
    }
}
