package Stack.Expressions;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String exp="-+A*BCD";
        Stack<String>st=new Stack<>();
        StringBuilder sb=new StringBuilder(exp);
        sb.reverse();
        for(char ch:sb.toString().toCharArray()){
            if(isOperator(ch)){
                st.push(st.pop()+st.pop()+ch);
            }
            else st.push(Character.toString(ch));
        }
        String output="";
        while(!st.isEmpty()){
            output+=st.pop();
        }
        System.out.println(output);
    }
    public static boolean isOperator(char c){
        if(c=='-' || c=='+' || c=='*' || c=='/'||c=='%'||c=='^'){
            return true;
        }
        else return false;
    }
}

