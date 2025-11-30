package Graph.Questions.Q12;

import java.util.Arrays;

public class dfs {
    static int[][]dirs={{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        int[][]image={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1,sc=1,color=2;

        System.out.println(Arrays.deepToString(f(image,sr,sc,color)));

    }

    private static int[][] f(int[][] image, int sr, int sc, int color) {
        int start=image[sr][sc];
        DFS(image,sr,sc,color,start);
        return image;
    }
    private static void DFS(int[][]image,int sr,int sc,int color,int start){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=start||image[sr][sc]==color)return;
        image[sr][sc]=color;
        for(int[]dir:dirs){
            DFS(image,sr+dir[0],sc+dir[1],color,start);
        }
    }

}
