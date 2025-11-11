package Greedy.Q10;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {

        int[][]a={{10,16},{2,8},{1,6},{7,12}};

        System.out.println(f(a));
    }
    public static int f(int[][]a){
        Arrays.sort(a,(p,q)->Integer.compare(p[1],q[1]));

        int end=a[0][1];
        int c=1;
        for(int i=1;i<a.length;i++){
            if(a[i][0]>end){
                c++;
                end=a[i][1];
            }
        }
        return c;
    }
}
