package Operators;

import java.util.*;
public class LogicalOperator {
    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers ");
         int num1=input.nextInt(); //5
         int num2=input.nextInt(); //6
        System.out.println(num1>num2 && num1==num2); //false
       System.out.println(num1>num2 || num1==num2); //false
       System.out.println(!(num1>num2)); //true

//      }
    }
}
