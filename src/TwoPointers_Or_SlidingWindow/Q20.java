package TwoPointers_Or_SlidingWindow;

public class Q20 {
    public static void main(String[] args) {
        //Number of Substrings Containing All Three Characters:

        String s="abcabc";

        int[]count=new int[3];
        int c=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            count[s.charAt(right)-'a']++;
            while(count[0]>0&&count[1]>0&&count[2]>0){
                c+=s.length()-right;
                count[s.charAt(left)-'a']--;
                left++;
            }
        }
        System.out.println(c);
    }
}
