package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        //Subset Sums:
        int[]a={5,6,7};
        System.out.println(subsetSums(a));
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        List<Integer> ll=new ArrayList<>();
        ArrayList<Integer>out=new ArrayList<>();

        subset(arr,ll,out,0,0);
        return out;

    }
    private static void subset(int[]nums,List<Integer>ll,ArrayList<Integer>out,int i,int sum){
        if(i==nums.length){
            out.add(sum);
            return;
        }
        ll.add(nums[i]);
        subset(nums,ll,out,i+1,sum+nums[i]);
        ll.removeLast();
        subset(nums,ll,out,i+1,sum);

    }
}
