package Pattern;

import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//    ****
//    ****
//    ****
//    ****

        System.out.println("Enter number of rows ");
        int n=input.nextInt();
        System.out.println("Enter number of coloumns ");
        int m=input.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
