package Greedy.Q13;

public class sol {
    public static void main(String[] args) {
        int[]a={2,3,1,1,4};

        System.out.println(f(a));
    }
    public  static boolean f(int[]a){
        int reachable=0;
        for(int i=0;i<a.length;i++){
            if(i>reachable)return false;
            reachable=Math.max(reachable,i+a[i]);
        }
        return true;
    }
}
