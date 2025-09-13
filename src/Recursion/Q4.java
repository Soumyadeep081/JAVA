package Recursion;


public class Q4 {
    public static void main(String[] args) {
        //Fibonacci series:
        for(int i=1;i<=5;i++){
            System.out.print(f(i));
        }

        System.out.println();

        //nth Fibonacci number:
        System.out.println(f(5));
    }
    private static int f(int n){
        if(n<=1) return n;
        return f(n-1)+f(n-2);
    }
}
