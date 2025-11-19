package Greedy.Q20;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[]c={100, 80, 70, 60, 70, 80, 90, 100, 90, 80, 70, 60, 60};

        System.out.println(f(c));
    }
    public static int f(int[]c){
        int total=0;
        int[]nc=new int[c.length];

        Arrays.fill(nc,1);
        for(int i=1;i<c.length;i++){
            if(c[i-1]<c[i])nc[i]=nc[i-1]+1;
        }
        for(int i=c.length-1;i>0;i--){
            if(c[i-1]>c[i]){
                nc[i-1]=Math.max(nc[i]+1,nc[i-1]);

            }
            total+=nc[i-1];
        }
        return total+nc[c.length-1];
    }
}
