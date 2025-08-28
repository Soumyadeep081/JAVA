package Stack.Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Q4 {
    public static void main(String[] args) {
        //Remove duplicates in lexicographical order:

        String s="bcabc";
        HashMap<Character,Integer>hm=new HashMap<>();
        HashSet<Character>hs=new HashSet<>();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hs.contains(c)){
                while(!st.isEmpty()&&c<st.peek()&&hm.get(st.peek())>i) hs.remove(st.pop());
                hs.add(c);
                st.push(c);
            }

        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
