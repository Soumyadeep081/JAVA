package Searching;

public class Q1 {
    public static void main(String[] args) {
        //Peak Element:

        int[]nums={1,2,1,3,5,6,4};
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            boolean leftOk=(mid==left||nums[mid]>nums[mid-1]);
            boolean rightOk=(mid==right||nums[mid]>nums[mid+1]);
            if(leftOk&&rightOk) {
                System.out.println(mid);
                return;
            }
            else if(mid>0&&nums[mid]<nums[mid-1]) right=mid-1;
            else left=mid+1;
        }
    }
}
