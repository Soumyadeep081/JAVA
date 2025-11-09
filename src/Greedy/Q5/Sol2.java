package Greedy.Q5;

import java.util.*;
public class Sol2 {
    public static void main(String[] args) {
        int[]arr={900, 940, 950, 1100, 1500, 1800};
        int[]dep={910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(f(arr,dep));
    }
    public static int f(int[]arr,int[]dep){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int res=1,platform=1;

        int i=1,j=0;
        while(i<arr.length&&j<dep.length){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            res=Math.max(res,platform);
        }
        return res;
    }
}
