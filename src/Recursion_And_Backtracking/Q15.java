package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {
    static List<List<String>>out=new ArrayList<>();
    public static void main(String[] args) {
        //NQueens:
        int n=4;
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        f(board,0,n);
        System.out.println(out);
    }
    private static void f(char[][]board,int row,int n){
        if(row==board.length){
            List<String>ll=new ArrayList<>();
            for(int i=0;i<n;i++){
                ll.add(new String(board[i]));
            }
            out.add(ll);
            return;
        }
        for(int c=0;c<board[0].length;c++){
            if(isSafe(board,row,c)){
                board[row][c]='Q';
                f(board,row+1,n);
                board[row][c]='.';
            }
        }
    }
    private static boolean isSafe(char[][]board,int row,int col){
        //Vertically upward:
        int r=row-1,c=col;
        while(r>=0){
            if(board[r][c]=='Q')return false;
            r--;
        }

        //horizontal left:
        r=row;
        c=col-1;
        while(c>=0){
            if(board[r][c]=='Q')return false;
            c--;
        }


        //upper diagonally right:
        r=row-1;
        c=col+1;
        while(r>=0&&c<board[0].length){
            if(board[r][c]=='Q') return false;
            r--;c++;
        }



        //upper diagonally left:
        r=row-1;
        c=col-1;
        while(r>=0&&c>=0){
            if(board[r][c]=='Q') return false;
            r--;c--;
        }


        return true;
    }

}
