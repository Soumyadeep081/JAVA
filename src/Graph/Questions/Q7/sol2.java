package Graph.Questions.Q7;

import java.util.*;


public class sol2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][]mat=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(updateMatrix(mat)));

    }

    private static int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]>q=new LinkedList<>();
        int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0)q.add(new int[]{i,j});
                else mat[i][j]=Integer.MAX_VALUE;
            }
        }

        while(!q.isEmpty()){
            int[]cell=q.poll();
            int row=cell[0];
            int col=cell[1];
            for(int[]dir:dirs){
                int newRow=row+dir[0];
                int newCol=col+dir[1];

                if(newRow>=0&&newRow<m&&newCol>=0&&newCol<n&&mat[newRow][newCol]>mat[row][col]+1){
                    mat[newRow][newCol]=mat[row][col]+1;
                    q.add(new int[]{newRow,newCol});
                }
            }

        }

        return mat;
    }
}
