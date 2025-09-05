package Stack.Questions;

import java.util.Stack;

public class Q13 {
    public static void main(String[] args) {
        //Score of Parenthesis:


        String s="(()(()))";
        Stack<Integer>st=new Stack<>();
        int score=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(score);
                score=0;
            }
            else score=st.pop()+Math.max(2*score,1);
        }
        System.out.println(score);
    }
}
