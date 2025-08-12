package String;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        //Longest Common Prefix:

        String[]s={"flower","flow","flight"};
        Arrays.sort(s);
        StringBuilder sb=new StringBuilder("");
        String f=s[0],l=s[s.length-1];
        for(int i=0;i<Math.min(f.length(),l.length());i++){
            if(f.charAt(i)==l.charAt(i)) sb.append(f.charAt(i));
            else break;
        }
        System.out.println(sb.toString());
    }
}
