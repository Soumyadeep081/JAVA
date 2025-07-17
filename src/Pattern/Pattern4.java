package Pattern;

import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        1
//        22
//        333
//        4444
//        55555
        System.out.println("Enter number ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
