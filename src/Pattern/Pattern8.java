package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//            *
//           ***
//          *****
//         *******
//          *****
//           ***
//            *
        System.out.println("Enter odd number ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("error");
        } else {
            int stars = 1, spaces = (n / 2) ;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= stars; k++) {
                    System.out.print("*");
                }
                System.out.println();
                if (i <= n / 2) {
                    stars += 2;
                    spaces--;
                } else {
                    stars -= 2;
                    spaces++;
                }
            }


        }
    }
}
