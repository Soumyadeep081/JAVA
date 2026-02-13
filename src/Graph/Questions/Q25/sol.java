package Graph.Questions.Q25;


import java.util.*;

public class sol {
    public static void main(String[] args) {
        int[][]grid={{0,0,0},{1,1,0},{1,1,0}};
        System.out.println(f(grid));
    }
    static class pair{
        int r,c,dist;
        pair(int r,int c,int dist){
            this.r=r;
            this.c=c;
            this.dist=dist;
        }
    }
    static int[][]dirs={{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
    public static int f(int[][]grid){
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1)return -1;
        int[][]distance=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(distance[i],Integer.MAX_VALUE);
        }
        distance[0][0]=1;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(0,0,1));
        while(!q.isEmpty()){
            pair p=q.poll();
            int r=p.r;
            int c=p.c;
            if(r==n-1&&c==n-1)return p.dist;
            for(int[]dir:dirs){
                int newR=r+dir[0];
                int newC=c+dir[1];
                if(newR>=0&&newR<n&&newC>=0&&newC<n&&grid[newR][newC]==0&&distance[newR][newC]>distance[r][c]+1){
                    distance[newR][newC]=distance[r][c]+1;
                    q.add(new pair(newR,newC,distance[newR][newC]));
                }
            }
        }
        return -1;
    }
}
