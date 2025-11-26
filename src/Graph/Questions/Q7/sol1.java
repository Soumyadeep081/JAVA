package Graph.Questions.Q7;

import java.util.Arrays;
import java.util.Scanner;

public class sol1 {
    static int min;
    public static void main(String[] args) {
        //DFS: Gives TLE

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
    public static int[][] updateMatrix(int[][] mat) {
        int[][]res=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0)res[i][j]=0;
                else{
                    int c=0;
                    min=Integer.MAX_VALUE;
                    boolean[][]vis=new boolean[mat.length][mat[0].length];
                    dfs(mat,i,j,c,vis);
                    res[i][j]=min;
                }
            }
        }
        return res;
    }
    private static void dfs(int[][]mat,int i,int j,int c,boolean[][]vis){
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||vis[i][j]){
            return;
        }
        if(mat[i][j]==0){
            min=Math.min(min,c);
            return;
        }
        vis[i][j]=true;
        dfs(mat,i+1,j,c+1,vis);
        dfs(mat,i-1,j,c+1,vis);
        dfs(mat,i,j+1,c+1,vis);
        dfs(mat,i,j-1,c+1,vis);
        vis[i][j]=false;
    }
}
