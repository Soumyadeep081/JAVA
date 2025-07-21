package Array.Questions;

import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        //Plus One:
        int[]nums={9,9,9,9};
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                System.out.println(Arrays.toString(nums));
                return;
            }
            nums[i]=0;
        }
        int[]ans=new int[nums.length+1];
                ans[0]=1;
            System.out.println(Arrays.toString(ans));
            return;

    }
}
