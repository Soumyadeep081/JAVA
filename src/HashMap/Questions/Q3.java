package HashMap.Questions;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        //Product of array except itself:
        int[]a={4,5,1,8,2};
        int[]res=f1(a);
        System.out.println(Arrays.toString(res));
    }
    private static int[] f1(int[]a){
       int[]res=new int[a.length];
       res[0]=1;
       for(int i=1;i<a.length;i++){
           res[i]=res[i-1]*a[i-1];
       }
       int right=1;
       for(int i=a.length-1;i>=0;i--){
           res[i]=res[i]*right;
           right*=a[i];
       }
       return res;
    }
}
