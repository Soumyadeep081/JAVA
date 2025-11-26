package Graph.Questions.Q6;


import java.util.Arrays;
import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        char[][]board=new char[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=input.next().charAt(0);
            }
        }

        f(board);

        System.out.println(Arrays.deepToString(board));

    }
    public static void f(char[][]board){
        if(board==null||board.length==0)return;


        for(int i=0;i<board.length;i++){
            dfs(board,i,0);
            dfs(board,i,board[0].length-1);
        }

        for(int j=0;j<board[0].length;j++){
            dfs(board,0,j);
            dfs(board,board.length-1,j);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='#')board[i][j]='O';
            }
        }
    }
    private static void dfs(char[][]board,int i,int j){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!='O')return;

        board[i][j]='#';

        dfs(board,i-1,j);
        dfs(board,i+1,j);
        dfs(board,i,j-1);
        dfs(board,i,j+1);
    }
}
