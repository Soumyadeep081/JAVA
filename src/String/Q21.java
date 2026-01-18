package String;

import java.util.Stack;

public class Q21 {
    public static void main(String[] args) {
        //394. Decode String:
        String s="3[a]2[bc]";

        System.out.println(f(s));
    }
    public static String f(String s){
        Stack<Integer>c=new Stack<>();
        Stack<String>st=new Stack<>();
        int k=0;
        String curr="";

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }
            else if(ch=='['){
                c.push(k);
                st.push(curr);
                k=0;
                curr="";
            }
            else if(ch==']'){
                int r=c.pop();
                StringBuilder sb=new StringBuilder(st.pop());
                for(int i=0;i<r;i++){
                    sb.append(curr);
                }
                curr=sb.toString();
            }
            else curr+=ch;
        }
        return curr;
    }
}
