package Stack.Implementations;

import java.util.Stack;

public class InBuilt_Imp {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        for(int i=1;i<=5;i++){
            st.push(i);
        }
        display(st);
        System.out.println("Popped item: "+st.pop());
        display(st);

        String q="67890";
        for(int i=0;i<q.length();i++){
            st.push(q.charAt(i)-'0');
        }
        display(st);
    }
    public static void display(Stack<Integer>st){
        if(st.isEmpty()){
            System.out.println("Empty Stack");
            return;
        }
        System.out.println("Stack:");
        for(int i=st.size()-1;i>=0;i--){
            System.out.println(st.get(i));
        }
    }
}
