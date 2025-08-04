package Array.Questions;
import java.util.*;
public class Q24 {
    //Spiral Matrix:
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(matrix));
    }
    static List<Integer> spiral(int[][]matrix){
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        List<Integer>ll=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ll.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ll.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ll.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ll.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ll;
    }
}
