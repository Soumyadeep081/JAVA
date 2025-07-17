package Pattern;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        1
//        12
//        123
//        1234
//        12345
        System.out.println("Enter number ");
        int n=input.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
