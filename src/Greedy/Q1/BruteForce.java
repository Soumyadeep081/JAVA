package Greedy.Q1;

public class BruteForce {
    public static void main(String[] args) {

    int[]a={4,2,3};
    int k=1;

        System.out.println(largestSumAfterKNegations(a,k));
}

static int maxSum=Integer.MIN_VALUE;
public static int largestSumAfterKNegations(int[] nums, int k) {
    f(nums,k);
    return maxSum;
}
private static void f(int[]nums,int k) {
    if (k == 0) {
        int sum = 0;
        for (int n : nums) sum += n;
        maxSum = Math.max(sum, maxSum);
        return;
    }
    for (int i = 0; i < nums.length; i++) {
        nums[i] = -nums[i];
        f(nums, k - 1);
        nums[i] = -nums[i];
    }
}
}
