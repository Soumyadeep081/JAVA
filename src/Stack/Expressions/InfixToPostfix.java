package Stack.Expressions;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix="A+B*C-D";
        String postfix="";
        Stack<Character>st=new Stack<>();
        for(char ch:infix.toCharArray()){
            if(isOperand(ch)){
                postfix+=ch;
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty()&&st.peek()!='('){
                    postfix+=st.pop();
                }
                if(!st.isEmpty()&&st.peek()=='(') st.pop();
            }
            else{
                while(!st.isEmpty()&&precedence(ch)<=precedence(st.peek())){
                    postfix+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()) postfix+=st.pop();
        System.out.println(postfix);

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
