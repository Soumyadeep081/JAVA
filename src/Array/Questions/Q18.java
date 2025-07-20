package Array.Questions;

public class Q18 {
    public static void main(String[] args) {
        //Transpose of a matrix:
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][]res=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res[j][i]=matrix[i][j];
            }
        }
        for (int i=0;i<res.length;i++){
            for(int j=0;j< res.length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
