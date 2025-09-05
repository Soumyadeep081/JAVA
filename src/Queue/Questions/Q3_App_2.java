package Queue.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q3_App_2 {
    public static void main(String[] args) {
        //Sliding Window Maximum:

        int[]nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        //Approach 2: Using queue:

        int max=Integer.MIN_VALUE;
        Queue<Integer> q=new LinkedList<>();
        int[]a=new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
            if(q.size()>k){
                q.poll();
            }
            if(q.size()==k){
                a[j++]=findMax(q);
            }

        }
        System.out.println(Arrays.toString(a));

    }
    private static int findMax(Queue<Integer>q) {
        int max=Integer.MIN_VALUE;
        for (int num:q){
            max=Math.max(max,num);
        }
        return max;
    }
}
