package Stack.Questions;

import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        // Remove All Adjacent Duplicates In String:

        String s="abbaca";

        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        System.out.println(sb.toString());

    }
}
