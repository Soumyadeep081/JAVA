package Array.Questions;

public class Q16 {
    public static void main(String[] args) {
        //Sum of diagonals of a matrix:
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i][i];
            if(i!=a.length-1-i) sum=sum+a[i][a.length-1-i];
        }
        System.out.println(sum);
    }
}
