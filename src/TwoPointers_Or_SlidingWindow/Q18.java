package TwoPointers_Or_SlidingWindow;

public class Q18 {
    public static void main(String[] args) {
        //Subarrays Product Less than K:

        int[]nums={1, 9, 2, 8, 6, 4, 3};
        int k=100;

        System.out.println(f(nums,k));
    }
    public static long f(int[]nums,int k){
        long p=1;
        int start=0;
        int res=0;
        for(int end=0;end<nums.length;end++){
            p*=nums[end];
            while(start<end&&p>=k){
                p/=nums[start++];
            }
            if(p<k){
                int len=end-start+1;
                res+=len;
            }
        }
        return res;
    }
}
