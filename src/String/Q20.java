package String;

import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.println(f(s));
    }

    private static int f(String s) {
        int open=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')open++;
            else open--;
            if(open<0){
                open=0;
                c++;
            }
        }
        return open>0?c+=open:c;
    }
}
