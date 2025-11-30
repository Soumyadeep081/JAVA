package Graph.Questions.Q10;

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

        System.out.println(shortestBridge(mat));
    }

    public static int shortestBridge(int[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        Queue<int[]>q=new LinkedList<>();
        boolean f=false;
        for(int i=0;i<grid.length;i++){
            if(f)break;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,visited,q);
                    f=true;
                    break;
                }
            }
        }

        int cnt=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int[]cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                for(int[]dir:dirs){
                    int newR=r+dir[0];
                    int newC=c+dir[1];
                    if(newR>=0&&newR<grid.length&&newC>=0&&newC<grid[0].length&&!visited[newR][newC]){
                        if(grid[newR][newC]==1)return cnt;
                        q.add(new int[]{newR,newC});
                        visited[newR][newC]=true;

                    }
                }
            }
            cnt++;
        }
        return -1;
    }
    private static void dfs(int[][]grid,int r,int c,boolean[][]visited,Queue<int[]>q){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||visited[r][c]||grid[r][c]==0)return;
        visited[r][c]=true;
        q.add(new int[]{r,c});
        for(int[]dir:dirs){
            int newR=r+dir[0];
            int newC=c+dir[1];
            dfs(grid,newR,newC,visited,q);
        }
    }

}
