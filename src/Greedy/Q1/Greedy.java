package Greedy.Q1;

import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[]a={4,2,3};
        int k=1;
        System.out.println(f(a,k));
    }
    public static int f(int[]a,int k){
        Arrays.sort(a);
        for(int i=0;i<a.length&&k>0;i++){
            if(a[i]<0){
                a[i]=-a[i];
                k--;
            }
        }
        Arrays.sort(a);
        if(k%2==1)a[0]=-a[0];

        int sum=0;
        for(int n:a)sum+=n;
        return sum;
    }
}
