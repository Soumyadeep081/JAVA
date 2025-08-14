package String;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        //Valid anagram:
        String s="anagram",g="nagaram";

        if(s.length()!=g.length()) System.out.println(false);
        char[] s2=s.toCharArray();
        char[] g2=g.toCharArray();
        Arrays.sort(s2);
        Arrays.sort(g2);
        System.out.println(Arrays.equals(s2,g2));
    }
}
