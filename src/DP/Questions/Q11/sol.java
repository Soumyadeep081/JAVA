package DP.Questions.Q11;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        String s="axxzxy";

        System.out.println(LongestRepeatingSubsequence(s));

    }
    static int[][]dp;
    public static int LongestRepeatingSubsequence(String s) {

        dp=new int[s.length()+1][s.length()+1];
        for(int[]row:dp) Arrays.fill(row,-1);
        return f(s,s,s.length(),s.length());
    }
    private static int f(String s1,String s2,int i,int j){
        if(i==0||j==0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)&&i!=j){
            return dp[i][j]=1+f(s1,s2,i-1,j-1);
        }
        return dp[i][j]=Math.max(f(s1,s2,i-1,j),f(s1,s2,i,j-1));
    }
}
