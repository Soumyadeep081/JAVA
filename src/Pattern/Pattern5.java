package Pattern;
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        *****
//        ****
//        ***
//        **
//        *
        System.out.println("Enter number ");
        int n=input.nextInt();

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
