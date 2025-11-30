package Graph.Questions.Q9;

import java.util.*;

public class sol {
    static class pair{
        int r;
        int c;
        int steps;
        public pair(int r,int c,int steps){
            this.r=r;
            this.c=c;
            this.steps=steps;
        }
    }
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

        System.out.println(f(mat));
    }

    private static int f(int[][] grid) {

        int dist=-1;
        int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<pair>q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    q.add(new pair(i,j,0));
                }
            }
        }

        while(!q.isEmpty()){
            pair cell=q.poll();
            int r=cell.r;
            int c=cell.c;
            int steps=cell.steps;

            dist=Math.max(dist,steps);
            for(int[]dir:dirs){
                int newR=r+dir[0];
                int newC=c+dir[1];
                if(newR>=0&&newR<grid.length&&newC>=0&&newC<grid[0].length&&grid[newR][newC]!=1){
                    grid[newR][newC]=1;
                    q.add(new pair(newR,newC,steps+1));
                }
            }
        }
        return dist==0?-1:dist;
    }

}
