package Recursion;

public class Q1 {
    public static void main(String[] args) {
        //Power of (x,n):


        double x=2;
        int n=-2;
        long N=n;
        if(n<0){
             N=-N;
            x=1/x;
        }
        System.out.println(help(x,N));
    }
    private static double help(double x,long n){
        if(n==0) return 1;
        else if(n%2==0) return help(x*x,n/2);
        else return x*help(x*x,n/2);
    }
}
