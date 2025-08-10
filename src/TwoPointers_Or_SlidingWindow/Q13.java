package TwoPointers_Or_SlidingWindow;

import java.util.HashMap;

public class Q13 {
    public static void main(String[] args) {
//Maximum Substring with K distinct characters:

        String s="aaabbccd";
        int k=2;
        int max=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int left=0,right=0;
        while(right<s.length()) {
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            while(hm.size()>k){
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
                if(hm.get(s.charAt(left))==0) hm.remove(s.charAt(left));
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        System.out.println(max);

    }
}
