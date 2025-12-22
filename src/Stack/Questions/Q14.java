package Stack.Questions;

import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.println(f(s));
    }
    public static int f(String s){
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek()=='('&&ch==')')st.pop();
                else st.push(ch);
            }
            else st.push(ch);
        }
        return st.size();
    }
}
