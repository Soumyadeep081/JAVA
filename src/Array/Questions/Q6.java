package Array.Questions;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        //Running Sum of 1d Array:
        int[]a={1,2,3,4,5};
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
        }
        for(int num:a){
            System.out.printf("%d\t",num);
        }
    }
}
