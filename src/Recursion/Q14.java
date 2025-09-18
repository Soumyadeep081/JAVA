package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        //Permutations ||:
        int[]nums={1,1,2};
        Arrays.sort(nums);
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>out=new ArrayList<>();
        boolean[]used=new boolean[nums.length];
        f(nums,ll,out,used);
        System.out.println(out);

    }
    private static void f(int[]nums, List<Integer>ll,List<List<Integer>>out,boolean[]used){
        if(ll.size()==nums.length){
            out.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
            ll.add(nums[i]);
            used[i]=true;
            f(nums,ll,out,used);
            ll.removeLast();
            used[i]=false;
        }
    }
}
