package Recursion_And_Backtracking;

public class Q16 {
    public static void main(String[] args) {
        //Find Hcf of two nums using Euclidean Principle:

        int n1=48,n2=18;
        System.out.println(f(n1,n2));
    }
    private static int f(int n1,int n2){
        if(n2==0) return n1;
        return f(n2,n1%n2);
    }
}
