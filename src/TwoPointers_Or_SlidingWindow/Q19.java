package TwoPointers_Or_SlidingWindow;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        //424. Longest Repeating Character Replacement
        String s="AABABBA";
        int k=1;

        int i=0,res=0,max=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            max=Math.max(max,hm.get(ch));
            while((j-i+1)-max>k){
                char left=s.charAt(i);
                hm.put(left,hm.get(left)-1);
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        System.out.println(res);
    }
}
