package Day2;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        //Taking Input using Scanner class

         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number ");
         int number=input.nextInt();
         System.out.println(number);
         System.out.print("Enter a floating number: ");
         float new_num=input.nextFloat();
         System.out.print("enter a integer ");
         int num=input.nextInt();
         System.out.print("now enter a character ");
         String new_char=input.next();
         System.out.println(new_char);
         System.out.println(num);
         System.out.println(new_num);
    }
}
