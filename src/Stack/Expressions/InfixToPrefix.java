package Stack.Expressions;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix="A-B-C";
        String prefix="";
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder(infix);
        sb.reverse();

        String swapped = "";
        for (char ch : sb.toString().toCharArray()) {
            if (ch == '(') swapped += ")";
            else if (ch == ')') swapped += "(";
            else swapped += ch;
        }
        for(char ch:swapped.toCharArray()){
            if(isOperand(ch)){
                prefix+=ch;
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty()&&st.peek()!='('){
                    prefix+=st.pop();
                }
                if(!st.isEmpty()&&st.peek()=='(') st.pop();
            }
            else{
                while(!st.isEmpty()&&precedence(ch)<precedence(st.peek())){
                    prefix+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()) prefix+=st.pop();
        StringBuilder sb2=new StringBuilder(prefix);
        System.out.println(sb2.reverse());
    }
    public static boolean isOperand(char c){
        if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9') return true;
        else return false;
    }
    public static int precedence(char ch){
        if(ch=='^') return 3;
        else if(ch=='*'||ch=='/'||ch=='%') return 2;
        else if(ch=='+'||ch=='-') return 1;
        else return 0;
    }
}



