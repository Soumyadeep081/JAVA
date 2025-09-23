package Recursion;
import java.util.*;
public class Q25 {
    //Word Search:
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("enter number of rows");
       int m=input.nextInt();
       System.out.println("enter number of coloumns");
       int n=input.nextInt();
       char[][] a=new char[m][n];
       input.nextLine();
       System.out.println("enter words: ");
       for(int i=0;i<m;i++){
         String line=input.nextLine();
         for(int j=0;j<n;j++){
           if(j<line.length()){
           a[i][j]=line.charAt(j);
           }
           else{
             a[i][j]=' ';
           }
     }
   }

   System.out.println("enter a word");
   String word=input.nextLine();
   boolean what=check(a,word);
   System.out.println(what);
 }
 public static boolean check(char[][]a,String word){
   for(int i=0;i<a.length;i++){
     for(int j=0;j<a[0].length;j++){
       //trying to find the character at 0th index.
       if(backtrack(i,j,word,0,a)){
         return true;
       }
     }
   }
   return false;
 }
 public static boolean backtrack(int row,int col,String word,int idx,char[][]a){
   if(idx>=word.length()){
     return true;
   }
   if(row<0||row==a.length||col<0||col==a[0].length||a[row][col]!=word.charAt(idx)){
     return false;
   }
   a[row][col]='#';
   int[] rowOffset={0,1,0,-1};
   int[] colOffset={1,0,-1,0};
   for(int d=0;d<4;d++){
    if( backtrack(row+rowOffset[d], col+colOffset[d], word, idx+1, a)){
     return true;
    }
   }
   a[row][col]=word.charAt(idx);
   return false;
 }


}
