package Recursion_And_Backtracking;

public class Q10 {
    public static void main(String[] args) {
        //Tower Of Hanoi:
        int n=3;
        toh(n,'A','B','C');
    }
    private static void toh(int n,char start,char end,char aux){
        if(n<=0) return;
        toh(n-1,start,aux,end);
        System.out.println("Move disk "+n+" from rod "+start+" to rod "+end);
        toh(n-1,aux,end,start);
    }
}
