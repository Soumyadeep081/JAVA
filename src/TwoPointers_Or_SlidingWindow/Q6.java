package TwoPointers_Or_SlidingWindow;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        //Move Zeroes:
        int[]a={0,1,0,2,0,3};
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                a[i++]=a[j];
            }
        }
        for(int k=i;k<a.length;k++){
            a[k]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
