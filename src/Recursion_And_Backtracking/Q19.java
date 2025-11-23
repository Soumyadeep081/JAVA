package Recursion_And_Backtracking;

public class Q19 {
    public static void main(String[] args) {
        //Sudoku Solver:
        char[][]board= {{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};
        f(board,0,0);
        printBoard(board);
    }
    private static boolean f(char[][]board,int row,int col){
        if(row==9) return true;
        if(col==9){
            return f(board,row+1,0);
        }
        if(board[row][col]!='.') return f(board,row,col+1);
        for(char ch='1';ch<='9';ch++){
            if(isSafe(board,row,col,ch)){
                board[row][col]=ch;
                if(f(board,row,col+1)) return true;
                board[row][col]='.';
            }
        }
        return false;
    }
    private static boolean isSafe(char[][]board,int row,int col,char ch){
        for(int i=0;i<9;i++){
            if(board[row][i]==ch)return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==ch)return false;
        }
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (board[startRow+i][startCol+j]==ch)return false;
            }
        }
        return true;
    }
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("| ");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
