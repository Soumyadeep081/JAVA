package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class Q14 {
    public static void main(String[] args) {
        //Sort Characters by frequency:

        String s="tree";
        Hashtable<Character,Integer>ht=new Hashtable<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ht.put(ch,ht.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>keys=new ArrayList<>(ht.keySet());
        ArrayList<Integer>vals=new ArrayList<>(ht.values());
        StringBuilder sb=new StringBuilder();
        while(!vals.isEmpty()){
            int max= Collections.max(vals);
            int idx=vals.indexOf(max);
            for(int i=0;i<max;i++){
                sb.append(keys.get(idx));
            }
            keys.remove(idx);vals.remove(idx);
        }
        System.out.println(sb.toString());
    }
}
