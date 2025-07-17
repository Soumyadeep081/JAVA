package Loops;

import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
         * For loop:
         * it is used to run a block of code a certain number of times.
         * Syntax: for(inital expression;condition;updation){
         * BLOCK OF STATMENT
         * }
         * --> In for loop the exact number of iterations are known.
         */

        //Sum of first n terms
        System.out.println("Enter a number ");
        int n=input.nextInt();
         int sum=0;
         for(int i=1;i<=n;i++){
             sum=sum+i;
         }
         System.out.println(sum);



         //Reverse of a number
        int rev=0,u;
         for(int i=n;i!=0;i=i/10){
             u=i%10;
             rev=rev*10+u;
         }
         System.out.println("Reverse:"+rev);


    }
}
