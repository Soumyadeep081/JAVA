package Stack.Questions;

import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        //Simplify Path

        String s="/home/user/Documents/../Pictures";

        Stack<String>st=new Stack<>();
        String[]str=s.split("/");
        for(String c:str){
            if(c.equals("")||c.equals(".")) continue;
            else if(c.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else st.push(c);
        }
    StringBuilder sb=new StringBuilder();
        for(String c:st){
            sb.append("/").append(c);
        }
        if (sb.length() > 0) {
            System.out.println(sb);
        } else {
            System.out.println("/");
        }

    }
}
