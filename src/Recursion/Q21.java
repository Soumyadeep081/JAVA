package Recursion;

import java.util.Stack;

public class Q21 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        System.out.println("Original Stack: " + stack);
        revStack(stack);
        System.out.println("Reversed Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }

    
    //Reverse a stack:
    private static void revStack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        revStack(st);
        help1(st,top);
    }
    private static void help1(Stack<Integer>st,int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();
        help1(st,val);
        st.push(top);
    }


    //Sort a Stack:
    private static void sortStack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        sortStack(st);
        help2(st,top);
    }
    private static void help2(Stack<Integer>st,int val){
        if(st.isEmpty()||st.peek()<=val){
            st.push(val);
            return;
        }
        int top=st.pop();
        help2(st,val);
        st.push(top);
    }
}
