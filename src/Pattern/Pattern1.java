package Pattern;

import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        *
//        **
//        ***
//        ****
//        *****

        System.out.println("Enter a number ");
        int n=input.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
