package Graph.Questions.Q26;

import java.util.Arrays;
import java.util.PriorityQueue;

public class sol {
    public static void main(String[] args) {
        int[][]heights={{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(f(heights));

    }
    static int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public static int f(int[][]heights){
        int n=heights.length;
        int m=heights[0].length;

        int[][]dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[]cell=pq.poll();
            int r=cell[0];
            int c=cell[1];
            int dis=cell[2];
            if(r==n-1&&c==m-1)return dis;
            if(dis>dist[r][c])continue;
            for(int[]dir:dirs){
                int nr=r+dir[0],nc=c+dir[1];
                if(nr>=0&&nr<n&&nc>=0&&nc<m){
                    int newDis=Math.max(dis,Math.abs(heights[r][c]-heights[nr][nc]));
                    if(newDis<dist[nr][nc]){
                        dist[nr][nc]=newDis;
                        pq.add(new int[]{nr,nc,dist[nr][nc]});
                    }
                }
            }
        }
        return 0;
    }
}
