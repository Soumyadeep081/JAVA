package Graph.Questions.Q21;

public class sol {
    public static void main(String[] args) {
        //Gives TLE:Need Dp
        int[][]mat={{9,9,4},{6,6,8},{2,1,1}};
        System.out.println(longestIncreasingPath(mat));
    }
    static int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public static int longestIncreasingPath(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans=Math.max(ans,f(mat,i,j));
            }
        }
        return ans;
    }
    public static int f(int[][]mat,int r,int c){
        int best=1;
        for(int[]dir:dirs){
            int newR=r+dir[0];
            int newC=c+dir[1];
            if(newR<mat.length&&newR>=0&&newC<mat[0].length&&newC>=0&&mat[newR][newC]>mat[r][c]){
                best=Math.max(best,1+f(mat,newR,newC));
            }
        }
        return best;
    }
}
