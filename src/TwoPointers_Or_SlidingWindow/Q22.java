package TwoPointers_Or_SlidingWindow;

import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        //567. Permutation in String:
        String s1="ab";
        String s2="eidbaooo";

        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>hm=new HashMap<>();
        for(char ch:s1.toCharArray())hm.put(ch,hm.getOrDefault(ch,0)+1);
        int valid=0;
        Map<Character,Integer>window=new HashMap<>();
        int left=0;
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (hm.containsKey(ch) &&
                    window.get(ch).equals(hm.get(ch))) {

                valid++;
            }
            while (i - left + 1 > s1.length()) {
                char remove = s2.charAt(left);
                if (hm.containsKey(remove) &&
                        window.get(remove).equals(hm.get(remove))) {

                    valid--;
                }
                window.put(remove, window.get(remove) - 1);

                if (window.get(remove) == 0) {
                    window.remove(remove);
                }

                left++;
            }
            if(valid==hm.size())return true;

        }
        return false;
    }
}
