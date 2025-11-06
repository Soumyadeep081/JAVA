package Heap.Questions;

import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        //Ugly Number ||:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        System.out.println(f(n));
    }

    public static int f(int n){
        int[]ugly_primes={2,3,5};
        PriorityQueue<Long>pq=new PriorityQueue<>();
        HashSet<Long>hs=new HashSet<>();
        hs.add(1L);
        pq.add(1L);

        long curr=1L;
        for(int i=0;i<n;i++){
            curr=pq.poll();
            for(int p:ugly_primes){
                long new_curr=curr*p;
                if(!hs.contains(new_curr)){
                    hs.add(new_curr);
                    pq.add(new_curr);
                }
            }

        }
        return (int)curr;
    }
}
