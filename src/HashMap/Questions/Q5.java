package HashMap.Questions;

import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        //Longest Substring without repeating characters:

        String s="abcabcbb";
        int left=0;
        int max=0;
        HashSet<Character>hs=new HashSet<>();
        for(int right=0;right<s.length();right++){
            if(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left++));
            }
            hs.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
