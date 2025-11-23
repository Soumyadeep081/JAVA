package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q13 {
    public static void main(String[] args) {
        //Permutations:
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>out=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        int[]nums={1,2,3};
        f(nums,ll,out,hs);
        System.out.println(out);
    }
    private static void f(int[]a, List<Integer>ll, List<List<Integer>>out, HashSet<Integer> hs){
        if(ll.size()==a.length){
            out.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!hs.contains(i)){
                ll.add(a[i]);
                hs.add(i);
                f(a,ll,out,hs);
                ll.removeLast();
                hs.remove(i);
            }
        }
    }
}
