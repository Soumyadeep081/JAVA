package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12 {
    public static void main(String[] args) {
        //Subset ||:
        int[]a={1,2,2};
        System.out.println(subsetsWithDup(a));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>out=new ArrayList<>();
        Arrays.sort(nums);
        f(nums,ll,out,0);
        return out;
    }
    private static void f(int[]nums,List<Integer>ll,List<List<Integer>>out,int i){
        out.add(new ArrayList<>(ll));
        for(int j=i;j<nums.length;j++){
            if(j>i&&nums[j]==nums[j-1]) continue;
            ll.add(nums[j]);
            f(nums,ll,out,j+1);
            ll.removeLast();
        }
    }
}

