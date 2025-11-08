package Greedy.Q1;

public class DeterministicGreedy {
    public static void main(String[] args) {

        int[]a={4,2,3};
        int k=1;

        System.out.println(largestSumAfterKNegations(a,k));
    }
    static int idx=0;
    public static int largestSumAfterKNegations(int[] nums, int k) {
        while(k!=0){
            if(isNegative(nums)){
                int minidx=findmin(nums);
                nums[minidx]*=-1;
            }
            else if(isZero(nums)) {
                nums[idx]*=-1;
            }
            else{
                int minidx=findmin(nums);
                nums[minidx]*=-1;
            }
            k--;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;

    }
    private static boolean isNegative(int[]a){
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                return true;
            }
        }
        return false;
    }
    private static boolean isZero(int[]a){
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                idx=i;
                return true;
            }
        }
        return false;
    }
    private static int findmin(int[]a){
        int min=a[0];
        int minidx=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                minidx=i;
            }
        }
        return minidx;

    }


}
