package Pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        *
//        **
//        ***
//        **
//        *


        System.out.println("Enter an odd number ");
        int n=input.nextInt();
        if(n%2!=0){
            int star=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                System.out.println();
                if(i<=n/2){
                    star++;
                }
                else{
                    star--;
                }
            }
        }
        else System.out.println("Error ");
    }
}
