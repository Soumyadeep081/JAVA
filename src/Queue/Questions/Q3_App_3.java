package Queue.Questions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;


public class Q3_App_3 {
    public static void main(String[] args) {
        //Sliding Window Maximum:

        int[]nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int j=0;
        //Approach 3: Using Deque:

        Deque<Integer>q=new LinkedList<>();
        int[]res=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty()&&nums[i]>=nums[q.peekLast()]){
                q.removeLast();
            }
            if(!q.isEmpty()&&q.peekFirst()-i>=k){
                q.removeFirst();
            }
            q.add(i);
            if(i>=k-1){
                res[j++] = nums[q.peekFirst()];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
