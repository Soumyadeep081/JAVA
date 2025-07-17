package Functions.Questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        System.out.println(fact(n));
    }
    static  int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
}
