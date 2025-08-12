package Array.Questions;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        //Pattern:

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int n=input.nextInt();
        int n1=n;
        int[][]m=new int[2*n-1][2*n-1];
        int top=0,bottom=2*n-2,left=0,right=2*n-2;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                m[top][i]=n;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                m[i][right]=n;
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    m[bottom][i] = n;
                }
            }
            bottom--;
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    m[i][left] = n;
                }
            }
            left++;

            n=n-1;
        }
        for(int i=0;i<2*n1-1;i++){
            for(int j=0;j<2*n1-1;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
