package Queue.Questions;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        //Sliding Window Maximum:


        int[]nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        
        //Approach 1: Brute Force:
        int max;
        int n=nums.length;
        int[]res=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            max=nums[i];
            for(int j=i;j<k+i;j++){
                max=Math.max(max,nums[j]);
            }
            res[i]=max;
        }
        System.out.println(Arrays.toString(res));



        //Approach 2:

    }
}
