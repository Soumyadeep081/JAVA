package TwoPointers_Or_SlidingWindow;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        //Next Permutations:
        int[]nums={2,4,1,7,5,0};

        f(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void f(int[]nums){
        int n=nums.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[p]){
                swap(nums,p,i);
                break;
            }
        }
        reverse(nums,p+1,n-1);
    }
    private static void reverse(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    private static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
