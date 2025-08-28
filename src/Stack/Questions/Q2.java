package Stack.Questions;

import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        //Valid Parenthesis:

        String s="({[]})";
        Stack<Character>st =new Stack<>();

                for(char ch:s.toCharArray()){
                    if(!st.isEmpty()){
                        if((st.peek()=='(' && ch==')') || (st.peek()=='{'&&ch=='}') || (st.peek()=='['&&ch==']')){
                            st.pop();
                        }
                        else st.push(ch);
                    }
                    else st.push(ch);
                }
        System.out.println(st.isEmpty());


    }
}
