package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        *   *
//        ** **
//        *****
//        ** **
//        *   *

        System.out.println("Enter odd number ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("error");
        }
        else{
            int star=1,space=n-2,stars=n;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                for(int k=1;k<=space;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                System.out.println();
                if(i==n/2){
                    for(int j=1;j<=stars;j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }

                if(i<n/2){
                    star++;
                    space-=2;
                }
                else{
                    star--;
                    space+=2;
                }

            }
        }
    }
}
