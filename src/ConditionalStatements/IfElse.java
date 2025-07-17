package ConditionalStatements;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {



         Scanner input = new Scanner(System.in);
         //Check whether two nums are equal or not

           System.out.println("enter two nums");
           int a=input.nextInt();
           int b=input.nextInt();
            if(a==b){
               System.out.println(a +"and "+b+"are equal");
           }
           else{
               System.out.println(a +" and "+b+" are not equal");
           }
//          boolean primesub=true;
//          boolean netsub=false;
//          if(primesub){
//              System.out.println("Welcome to prime subscription");
//          }
//          else{
//              System.out.println("Regret");
//          }
//          if(netsub){
//              System.out.println("regret");
//          }
//          else{
//              System.out.println("welcome to netflix");
//          }


 //Subscription or not
 System.out.println("enter a number");
 int num=input.nextInt();
 if(num==0){
     System.out.println("Super subscription");

 }
 else if(num==1){
     System.out.println("Premium subscription");
 }
 else if(num==2){
     System.out.println("no subscription");
 }
 else{
     System.out.println("Error");
 }


 //Greatest of three numbers
        System.out.println("Enter c");
 int c=input.nextInt();
 if(a>b && a> c){
     System.out.println(a+"is greatest");
 } else if (b>a && b>c) {
     System.out.println(b+"is greatest");

 }
 else{
     System.out.println(c+"is greatest");
 }

    }
}
