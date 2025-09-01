package Stack.Expressions;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String exp="+*ABC";
        Stack<String> st=new Stack<>();
        StringBuilder sb1=new StringBuilder(exp);
        sb1.reverse();
        for(char ch:sb1.toString().toCharArray()){
            if(isOperator(ch)){
                String op1 = st.pop();
                String op2 = st.pop();
                st.push("(" + op1 + ch + op2 + ")");
            }
            else st.push(Character.toString(ch));
        }
        String out="";
        while(!st.isEmpty()){
            out+=st.pop();
        }
        System.out.println(out);
    }
    public static boolean isOperator(char c){
        if(c=='-' || c=='+' || c=='*' || c=='/'||c=='%'||c=='^'){
            return true;
        }
        else return false;
    }

}
