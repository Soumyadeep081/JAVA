package Graph.Questions.Q5;

import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        char[][]grid=new char[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=input.next().charAt(0);
            }
        }

        System.out.println(f(grid));
    }
    public static int f(char[][]grid){
        if(grid==null||grid.length==0)return 0;
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    dfs(grid,i,j);
                }
            }
        }
        return c;
    }
    private static void dfs(char[][]grid,int i,int j){
        if(i>=grid.length||i<0||j>=grid[0].length||j<0||grid[i][j]=='0')return;

        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);

    }
}
