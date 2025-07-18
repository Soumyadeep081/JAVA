package Array;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
                 Scanner input=new Scanner(System.in);


         System.out.println("enter rows");
         int m= input.nextInt();
         System.out.println("enter number of columns");
         int n= input.nextInt();
         int[][] a= new int[m][n];
         System.out.println("enter matrix elements");
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 a[i][j]=input.nextInt();
             }
         }
         System.out.println("matrix is:");
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 System.out.printf("%d\t",a[i][j]);
             }
             System.out.println();
         }



         int[][] b={
             {1,2},
             {2,3},
             {3,4}
         };
         for(int i=0;i<3;i++){
             for(int j=0;j<2;j++){
             System.out.println(b[i][j]);
             }
         }


         //Jagged Arrays:
         //every row has indefinite number of coloumns.
         int[][] c =new int[2][];
         c[0] = new int[4];
         c[1]= new int[3];
         for(int i=0;i<c.length;i++){
             for(int j=0;j<c[i].length;j++){
                 System.out.printf("%d\t",c[i][j]);
             }
             System.out.println();
         }
    }
}
