package TwoPointers_Or_SlidingWindow;
import java.util.LinkedHashSet;

public class Q11 {
    public static void main(String[] args) {
        //Longest Substring Without Repeating Characters:


        //Approach 1: Using HashSet:
        String s="ohvhjdml";
        int left=0,max=0;
        LinkedHashSet<Character>ht =new LinkedHashSet<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(ht.contains(ch)){
                ht.remove(s.charAt(left++));
            }
            ht.add(ch);
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
        System.out.println(ht);

    }
}
