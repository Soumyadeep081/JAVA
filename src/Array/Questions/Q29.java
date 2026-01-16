package Array.Questions;

public class Q29 {
    public static void main(String[] args) {
        //subarray with maximum sum:
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};

        int start=0,ansStart=0,end=0;
        int curr=nums[0],max=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>curr+nums[i]){
                curr=nums[i];
                start=i;
            }
            else curr+=nums[i];

            if(curr>max){
                max=curr;
                ansStart=start;
                end=i;
            }
        }

        for(int i=ansStart;i<=end;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
