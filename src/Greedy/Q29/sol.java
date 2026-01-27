package Greedy.Q29;

import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n==2)return 1;
        if(n==3)return 2;
        int res=1;
        while(n>4){
            res*=3;
            n-=3;
        }
        res*=n;
        return res;
    }
}
