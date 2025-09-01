package Stack.Expressions;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String exp="ABC*+D-";
        Stack<String>st=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(isOperator(ch)){
                String op2 = st.pop();
                String op1 = st.pop();
                st.push("(" + op1 + ch + op2 + ")");
            }
            else st.push(Character.toString(ch));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
    public static boolean isOperator(char c){
        if(c=='-' || c=='+' || c=='*' || c=='/'||c=='%'||c=='^'){
            return true;
        }
        else return false;
    }
}
