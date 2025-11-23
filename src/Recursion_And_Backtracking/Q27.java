package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q27 {
    public static void main(String[] args) {
        int a=427;
        int b=428;
        int c=353;
        char[]digitsArr=String.valueOf(c).toCharArray();
        Arrays.sort(digitsArr);
        List<String>ll=new ArrayList<>();
        String digits=new String(digitsArr);
        boolean[]used=new boolean[digits.length()];
        f(digits,"",ll,used);
        int min=Integer.MAX_VALUE;
        for(String s:ll){
            int num=Integer.parseInt(s);
            if(num>a&&num>b&&rev(num)<rev(a)&&rev(num)<rev(b)){
                min=Math.min(min,num);
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("No valid permutation found");
        } else {
            System.out.println("Minimum valid permutation: " + min);
        }


    }
    private static void f(String digits, String curr, List<String> ll, boolean[]used){
        if(curr.length()==digits.length()){
            ll.add(curr);
            return;
        }
        for(int i=0;i<digits.length();i++){
            if(i>0&&digits.charAt(i)==digits.charAt(i-1)&&!used[i-1])continue;
            if(!used[i]){
                used[i]=true;
                f(digits,curr+digits.charAt(i),ll,used);
                used[i]=false;
            }
        }
    }
    private static int rev(int num){
        int rev=0;
        while(num!=0){
            int u=num%10;
            rev=rev*10+u;
            num/=10;
        }
        return rev;
    }
}
