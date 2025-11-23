package Recursion_And_Backtracking;


public class Q7 {
    public static void main(String[] args) {
        //Power of 2:
        System.out.println(f(16));
        }
        private static boolean f(int n){
        if(n<=0) return false;
        if(n==1) return true;
        return n%2==0 && f(n/2);
        }

}
