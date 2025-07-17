package Functions.Questions;

import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=input.nextInt();
        if(isPrime(n)==1){
            System.out.println(n+" is prime");
        }
        else if(isPrime(n)==0) System.out.println(n+" is not prime");
        else System.out.println("Error");
    }
    static int isPrime(int n){
        if(n<2){
            return -1;
        }
        else if(n==2){
            return 1;
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c==0) return 1;
        else return 0;

    }
}
