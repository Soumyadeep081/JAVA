package TwoPointers_Or_SlidingWindow;

import java.util.HashSet;


public class Q5 {
    public static void main(String[] args) {
        //Happy Numbers:
        int n=19;

        //Approach 1: Using Hashset:
        HashSet<Integer>hs=new HashSet<>();
        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            n=square(n);
        }
        System.out.println(n==1);


        //Approach 2: Using two pointers:
        int slow=n,fast=(square(n));
        while(fast!=1 && slow!=fast){
                slow=square(slow);
                fast=square(square(fast));
        }
        System.out.println(fast==1);


        //Approach 3: Using recursion:
        System.out.println(isHappy(n));


    }
    static  int square(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum=sum+temp*temp;
            n=n/10;
        }
        return sum;
    }

    static boolean isHappy(int n){
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            n=square(n);
        }
        return isHappy(n);


    }
}
