package Greedy.Q25;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[]happiness={1,2,3};
        int k=2;

        System.out.println(f(happiness,k));
    }
    public static long f(int[]happiness,int k){
        int neg=0;
        long res=0;
        Arrays.sort(happiness);

        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            if(happiness[i]+neg>0)res+=(long)happiness[i]+neg;
            neg--;
        }
        return res;
    }
}
