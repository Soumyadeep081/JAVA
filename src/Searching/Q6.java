package Searching;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        //Floor and Ceil in Sorted Array:
        int[]nums={3,4,4,7,8,10};
        int x=5;
        int ceil=-1,floor=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==x){
                ceil=nums[mid];
                floor=nums[mid];
                break;
            }
            else if(nums[mid]>x){
                ceil=nums[mid];
                high=mid-1;
            }
            else{
                floor=nums[mid];
                low=mid+1;
            }
        }
        int[] res={floor,ceil};
        System.out.println(Arrays.toString(res));

    }
}
