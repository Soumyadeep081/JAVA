package Graph.Questions.Q15;

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

        System.out.println(Arrays.deepToString(f(mat)));

    }
    public static int[][]f(int[][]isWater){
        Queue<int[]>q=new LinkedList<>();
        int m=isWater.length;
        int n=isWater[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    isWater[i][j]=0;
                    q.add(new int[]{i,j});
                }
                else isWater[i][j]=Integer.MAX_VALUE;
            }

        }
        int[][]dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[]cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            for(int[]dir:dirs){
                int newr=r+dir[0];
                int newc=c+dir[1];

                if(newr>=0&&newr<m&&newc>=0&&newc<n&&isWater[newr][newc]>isWater[r][c]+1){
                    isWater[newr][newc]=isWater[r][c]+1;
                    q.add(new int[]{newr,newc});
                }
            }
        }
        return isWater;
    }
}
