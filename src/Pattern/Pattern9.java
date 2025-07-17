package Pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        *******
//        *** ***
//        **   **
//        *     *
        System.out.println("Enter number ");
        int n=input.nextInt();
        int stars=(2*n)-1,star=n-1,space=1;
        for(int i=1;i<=stars;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=star;l++){
                System.out.print("*");
            }
            System.out.println();
            star--;
            space+=2;
        }
    }
}
