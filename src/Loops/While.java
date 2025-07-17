package Loops;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

 /*
  * while loop: Runs a particular step again and again untill condition is met
  syntax: initial condition;
          while(final condition){
          BLOCK OF CODE;
          update of condition;
          }
          -> In while loop the exact number of iterations are not known already.
  */


         int rev=0,u;
         System.out.println("enter a number");
         int n=input.nextInt();
         while(n!=0){
             u=n%10;
             rev=rev*10+u;
             n=n/10;
         }
         System.out.println("reversed number= "+rev);

    }
}
