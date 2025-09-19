package Recursion;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        //Print all balanced parentheses for n pairs:

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int n=input.nextInt();
        f("",0,0,n);
    }

    private static void f(String s,int open,int close,int n){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n){
            f(s+"(",open+1,close,n);
        }
        if(close<open){
            f(s+")",open,close+1,n);
        }
    }



}
