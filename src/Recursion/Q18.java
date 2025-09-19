package Recursion;

public class Q18 {
    public static void main(String[] args) {
       //Josephus Problem:
        int n=3,k=2;
        System.out.println(f(n,k));

        System.out.println(f2(n,k));
    }
    //For 1 based indexing:
    private static int f(int n,int k){
        if(n<=1) return 1;
        return (f(n-1,k)+k-1)%n+1;
    }
    //For 0 based indexing:
    private static int f2(int n,int k){
        if(n<=1)return 0;
        return (f2(n-1,k)+k)%n;
    }
}
