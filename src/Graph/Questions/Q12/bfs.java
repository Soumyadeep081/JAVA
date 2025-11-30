package Graph.Questions.Q12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static class pair{
        int r;
        int c;
        public pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public static void main(String[] args) {
        int[][]image={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1,sc=1,color=2;

        System.out.println(Arrays.deepToString(f(image,sr,sc,color)));
    }
    public static int[][] f(int[][]image,int sr,int sc,int color){
        int original=image[sr][sc];
        if(original==color)return image;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(sr,sc));
        int[][]dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            pair p=q.poll();
            int r=p.r;
            int c=p.c;

            image[r][c]=color;
            for(int[]dir:dirs){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr<image.length&&nr>=0&&nc<image[0].length&&nc>=0&&image[nr][nc]==original){
                    q.add(new pair(nr,nc));
                }
            }
        }
        return image;
    }

}
