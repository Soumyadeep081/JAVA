package Graph.Questions.Q8;

import java.util.*;


public class sol {
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
    public static int f(int[][]grid){
        Queue<int[]>q=new LinkedList<>();
        int f=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)q.add(new int[]{i,j});
                else if(grid[i][j]==1)f++;
            }
        }
        if(f==0)return 0;
        int[][]dirs={{1,0},{-1,0},{0,1},{0,-1}};
        int mins=-1;
        while(!q.isEmpty()){
            int size=q.size();
            mins++;
            while(size-->0){
                int[]cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                for(int[]dir:dirs){
                    int newR=r+dir[0];
                    int newC=c+dir[1];

                    if(newR>=0&&newR<grid.length&&newC>=0&&newC<grid[0].length&&grid[newR][newC]==1){
                        grid[newR][newC]=2;
                        f--;
                        q.add(new int[]{newR,newC});
                    }
                }
            }
        }
        return f==0?mins:-1;
    }
}
