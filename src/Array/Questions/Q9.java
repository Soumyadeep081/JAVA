package Array.Questions;

public class Q9 {
    public static void main(String[] args) {
        //Richest Customer Wealth:
        int[][]a={{1,2,3},{2,3,4}};
        int sum=0,max=0;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=0;j<a[0].length;j++){
                sum=sum+a[i][j];
            }
            if(max<sum) max=sum;
        }
        System.out.println(max);
    }
}
