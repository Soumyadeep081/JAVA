package DP.Questions.Q12;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        String s = "ilikegfg";
        String[]dictionary={"i", "like", "man", "india", "gfg"};
        System.out.println(wordBreak(s,dictionary));
    }
    public static boolean wordBreak(String s, String[] dictionary) {
        Boolean[] dp=new Boolean[s.length()];
        return f(s,new HashSet<>(Arrays.asList(dictionary)),0,dp);
    }
    private static boolean f(String s,Set<String>hs,int idx,Boolean[]dp){
        if(idx==s.length())return true;
        if(dp[idx]!=null)return dp[idx];
        for(int j=idx+1;j<=s.length();j++){
            String word=s.substring(idx,j);
            if(hs.contains(word)&&f(s,hs,j,dp)){
                return dp[idx]=true;
            }
        }
        return dp[idx]=false;
    }
}
