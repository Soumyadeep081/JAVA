package Loops;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        /*
         * Do while loop: Execution of statement occurs before checking the condition then for subsequent executions condition is checked and loop runs untill condition falls.
         * Syntax: do{
         * BLOCK OF CODE;
         * updation;
         * }while(condition);
         */

         /*
          * Difference between while and do while loop:
          while: 1.Condition is checked first.
                 2.If the condition is false no steps executed.
                 3.No need of semicolon.
                 4.Syntax
          do while: 1.Condition is checked after first step.
                    2.At least one step is executed even if the condition is wrong.
                    3.semicolon is required at the end of the loop.
          *      4.Syntax

*/

        System.out.println("Enter a number ");
        int n=input.nextInt();
             int i=1,sum=0;
          do{
              sum = sum + i;
              i++;
          }while(i<=n);
          System.out.println(sum);


        System.out.println("\n--- Demonstrating 'at least once' ---");
        int j = 5;
        do {
            System.out.println("Value of j (do-while, initial condition false): " + j);
            j++;
        } while (j < 5);

    }
}
