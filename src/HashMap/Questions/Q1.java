package HashMap.Questions;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        //Max Frequency Character:
        String s="abbcbbaadbbbe";
       f(s);

    }
    private static void f(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int max=Integer.MIN_VALUE;
        char key='\0';
        for(Map.Entry<Character,Integer>entry:hm.entrySet()){
            if(max==entry.getValue()){
                if(key>entry.getKey())key=entry.getKey();
            }
            if(entry.getValue()>max){
                max=entry.getValue();
                key=entry.getKey();
            }
            else continue;
        }
        System.out.println(key+":"+max);
    }
}
