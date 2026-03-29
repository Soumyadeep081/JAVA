package DP.Questions.Q3;

import java.util.Arrays;
import java.util.Scanner;

public class sol1 {
    public static void main(String[] args) {
        //Using memoization:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n,dp));
    }
    private static int f(int n,int[]dp){
        if(n<=1)return 1;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=f(n-1,dp)+f(n-2,dp);
    }
}
