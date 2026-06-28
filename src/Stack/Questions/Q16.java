package Stack.Questions;

import java.util.Stack;

public class Q16 {
    public static void main(String[] args) {
        //Expression contains redundant bracket or not:
        String s="((a+b+(c)/d))";

        System.out.println(checkRedundancy(s));
    }
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                char top=st.pop();
                boolean flag=true;
                while(top!='('){
                    if(top=='+'||top=='-'||top=='/'||top=='*'){
                        flag=false;
                    }
                    top=st.pop();
                }
                if(flag)return true;

            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
}
