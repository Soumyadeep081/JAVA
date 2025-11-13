package Greedy.Q14;

public class sol {
    public static void main(String[] args) {
        int[]a={2,3,1,1,4,1,8};

        System.out.println(f(a));
    }
    public static int f(int[]a){
        int jumps=0;
        int l=0,r=0;

        while(r<a.length-1){
            int farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Math.max(farthest,i+a[i]);

            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }
}
