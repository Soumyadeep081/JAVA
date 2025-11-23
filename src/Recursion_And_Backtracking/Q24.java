package Recursion_And_Backtracking;

import java.util.ArrayList;

import java.util.List;

public class Q24 {
    public static void main(String[] args) {
        //Palindrome Partitioning:
        String s="aab";
        List<List<String>>out=new ArrayList<>();
        f(s,0,new ArrayList<>(),out);
        System.out.println(out);
    }
    private static void f(String s, int i, List<String>ll,List<List<String>>out){
        if(i==s.length()){
            out.add(new ArrayList<>(ll));
            return;
        }
        for(int end=i;end<s.length();end++){
            if(isPalindrome(s,i,end)){
                ll.add(s.substring(i,end+1));
                f(s,end+1,ll,out);
                ll.removeLast();
            }
        }

    }
    private static boolean isPalindrome(String s,int left,int right){
        if(left>=right)return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return isPalindrome(s,left+1,right-1);
    }
}
