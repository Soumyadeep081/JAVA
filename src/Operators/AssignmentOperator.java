package Operators;

import java.util.*;
public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a and b ");
        a=input.nextInt();
        b=input.nextInt();
         c=a+b;
         System.out.println(c+=1);
         System.out.println(c-=1);
         System.out.println(c*=2);
         System.out.println(c/=2);
         System.out.println(c%=2);
    }
}
