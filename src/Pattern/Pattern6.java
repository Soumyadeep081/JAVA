package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//            *
//           ***
//          *****
//         *******
//        *********

        System.out.println("Enter a number ");
        int n=input.nextInt();
        int stars=1,spaces=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++){
                System.out.print("*");
            }
            System.out.println();

            spaces--;
            stars+=2;

        }
    }
}
