package Greedy.Q9;

import java.util.*;
public class sol {
    public static void main(String[] args) {
        //Using Greedy and Monotonic Stack:

        String s="bcabc";

        System.out.println(f(s));
    }
    public static String f(String s){
        HashSet<Character>visited=new HashSet<>();
        HashMap<Character,Integer>last_index=new HashMap<>();
        Stack<Character>st=new Stack<>();

        for(int i=0;i<s.length();i++){
            last_index.put(s.charAt(i),i);
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!visited.contains(ch)){
                while(!st.isEmpty()&&ch<st.peek()&&last_index.get(st.peek())>i){
                    visited.remove(st.pop());

                }
                st.push(ch);
                visited.add(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}
