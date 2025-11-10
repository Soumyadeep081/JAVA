package Greedy.Q7;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[][]a={{1,2},{2,3},{3,4},{1,3}};

        System.out.println(f(a));

    }
    public static int f(int[][]a){
        Arrays.sort(a,(p,q)->p[1] - q[1]);

        int c=0;
        int last=a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]>=last)last=a[i][1];
            else c++;
        }
        return c;
    }
}
