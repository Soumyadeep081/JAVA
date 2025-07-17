package Functions.Questions;

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=input.nextInt();
        if(isPalindrome(n)){
            System.out.println("Entered number is palindrome");
        }
        else System.out.println("Entered number is not palindrome");
    }
    public static boolean isPalindrome(int n){
        int u,rev=0,n1=n;
        while(n!=0){
            u=n%10;
            rev=rev*10+u;
            n=n/10;
        }
        return (n1==rev);

    }

}
