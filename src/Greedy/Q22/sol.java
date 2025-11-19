package Greedy.Q22;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[][]a={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(f(a));
    }
    public static int f(int[][]intervals){
        Arrays.sort(intervals,(a, b)->a[1] - b[1]);
        int count=0;
        int last=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=last)last=intervals[i][1];
            else count++;
        }
        return count;
    }
}
