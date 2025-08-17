package Searching;

public class Q10 {
    public static void main(String[] args) {
        //Search in rotated Sorted Array ||:

        int[]nums={2,5,6,0,0,1,2};
        int x=0;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==x){
                System.out.println(mid);
                return;
            }
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;
                high--;
            }
            else if(nums[mid]>=nums[low]){
                if(x>=nums[low]&&x<nums[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(x>nums[mid]&&x<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }
        System.out.println(-1);
    }
}
