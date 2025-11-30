package Graph.Questions.Q13;

import java.util.*;

public class sol {
    static int[][]dirs={{1,0},{-1,0},{0,1},{0,-1}};

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

        System.out.println(numEnclaves(mat));
    }
    public static int numEnclaves(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            dfs(grid,i,0);
            dfs(grid,i,grid[0].length-1);
        }

        for(int i=0;i<grid[0].length;i++){
            dfs(grid,0,i);
            dfs(grid,grid.length-1,i);
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)c++;
            }
        }
        return c;
    }
    public static void dfs(int[][]grid,int r,int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1) return;
        grid[r][c] = 2;
        for (int[] dir : dirs) {
            dfs(grid, r + dir[0], c + dir[1]);
        }
    }

}
