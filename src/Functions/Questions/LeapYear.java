package Functions.Questions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter year ");
        int n=input.nextInt();
        if(isLeapyear(n)) System.out.println(n+" is a Leap Year");
        else System.out.println(n+" is not a leap year");
    }
    static boolean isLeapyear(int n){
        return n % 4 == 0 && n % 100 != 0 || n % 400 == 0;
    }
}
