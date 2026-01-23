package Stack.Questions;

import java.util.Stack;

public class Q15 {
    public static void main(String[] args) {
        //32. Longest Valid Parentheses:
        String s="()())";

        Stack<Integer>st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(i);
            else{
                st.pop();
                if(st.isEmpty())st.push(i);
                else max=Math.max(max,i-st.peek());
            }
        }
        System.out.println(max);
    }
}
