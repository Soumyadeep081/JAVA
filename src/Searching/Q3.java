package Searching;

public class Q3 {
    public static void main(String[] args) {
        //Lower Bound:

        int[]nums={1,2,2,3};
        int x=2;
        int low=0,high=nums.length;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]>=x) high=mid;
            else low=mid+1;
        }
        System.out.println(low);

    }
}
