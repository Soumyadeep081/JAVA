package String;

import java.util.Hashtable;

public class Q6 {
    public static void main(String[] args) {
        //Largest Substring Between Two Equal Characters:

        String s="abcaddb";

        int max=-1;
        Hashtable<Character,Integer>hs=new Hashtable<>();
        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                max=Math.max(max,i-hs.get(s.charAt(i))-1);
            }
            else hs.put(s.charAt(i),i);
        }
        System.out.println(max);
        
    }
}
