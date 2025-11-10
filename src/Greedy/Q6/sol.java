package Greedy.Q6;

import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int start=input.nextInt();
        int target=input.nextInt();

        System.out.println(f(start,target));
    }
    public static int f(int start,int target){
        //Intuition: Easier to find from target to start
        //we know any number can be multiplied by 2 but only an even number can be divided by 2
        //that's why we chose to change from target to start
        int ans=0;
        while(target>start){
            if(target%2==0)target/=2;
            else target++;
            ans++;
        }
        return ans+start-target;
    }
}
