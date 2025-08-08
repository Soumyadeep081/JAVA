package TwoPointers;

import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        //max subarray sum ≤ k

        int[]a={2,5,1,7,10};
        int k=14;

        //Approach 1: Brute Force;

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum<=k){
                    maxSum=Math.max(sum,maxSum);
                }
                else break;
            }
        }
        System.out.println(maxSum);


        //Approach 2: Two Pointer/Sliding Window:
        int left=0,right=0;
        int maxSum2=0;
        int sum2=0;
        while(right<a.length){
            sum2=sum2+a[right++];
            while(sum2>k){
                sum2=sum2-a[left++];
            }
                maxSum2=Math.max(maxSum2,sum2);
        }
        System.out.println(maxSum2);




    }
}
