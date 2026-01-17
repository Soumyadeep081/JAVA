package TwoPointers_Or_SlidingWindow;

import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        //80. Remove Duplicates from Sorted Array II:

        int[]nums={1,1,1,2,2,3};

        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k++]=nums[i];
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,k)));
    }
}
