package Array.Questions;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        //Spiral matrix ||:
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=input.nextInt();
        int[][]matrix=generateMatrix(n);
        System.out.println("Generated Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d\t",matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int top=0,bottom=n-1,left=0,right=n-1;
        int num=1;
        int[][]matrix=new int[n][n];
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                matrix[top][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=num++;
                }
                left++;
            }
        }

        return matrix;
    }
}
