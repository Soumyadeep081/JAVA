package Functions.Questions;

import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=input.nextInt();
        if(check(n)){
            System.out.println("Entered number is Armstrong");
        }
        else System.out.println("Entered number is Not Armstrong");
    }
    public static boolean check(int n){
        int n1,n2,c=0,sum=0;
        n1=n;
        while(n!=0){
            c++;
            n=n/10;
        }
        n2=n1;
        while(n1!=0){
            int u=n1%10;
            sum=sum+(int)Math.pow(u,c);
            n1=n1/10;
        }
        return (n2==sum);
    }
}
