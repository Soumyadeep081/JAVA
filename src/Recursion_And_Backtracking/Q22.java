package Recursion_And_Backtracking;

import java.util.*;

public class Q22 {
    static int max=2;
    public static void main(String[] args) {
        //Print the length of the longest balanced subsequence of an array:


        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        List<Integer>ll=new ArrayList<>();
        sub(a,0,ll);
        System.out.println(max);

    }
    private static void sub(int[]a, int i, List<Integer>ll){
        if(i==a.length){
            if(!ll.isEmpty()&&isBal(ll)){
                max=Math.max(max,ll.size());
            }
            return;
        }
        ll.add(a[i]);
        sub(a,i+1,ll);
        ll.removeLast();
        sub(a,i+1,ll);
    }
    private static boolean isBal(List<Integer>ll){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : ll) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        int freq = -1;
        for (int val : hm.values()) {
            if (freq == -1) freq = val;
            else if (val != freq) return false;
        }
        return true;
    }
}
