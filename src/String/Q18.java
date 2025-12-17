package String;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        //8. String to Integer (atoi)
        Scanner input=new Scanner(System.in);

        String s=input.next();

        System.out.println(f(s));

    }
    public static int f(String s){
        s=s.trim();
        int sign=1,i=0;
        long res=0;
        if(s.length()==0)return 0;
        if(s.charAt(0)=='-'){
            sign=-1;i++;
        }
        else if(s.charAt(0)=='+')i++;
        while(i<s.length()){
            if(s.charAt(i)<'0'||s.charAt(i)>'9')break;
            res=res*10+(s.charAt(i)-'0');
            if(res*sign < Integer.MIN_VALUE)return Integer.MIN_VALUE;
            if(res*sign > Integer.MAX_VALUE)return Integer.MAX_VALUE;
            i++;
        }
        return (int)res*sign;
    }
}
