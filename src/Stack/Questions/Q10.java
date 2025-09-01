package Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class Q10 {
    public static void main(String[] args) {
        //Next Greater Element ||:

        int[] nums={1,8,-1,-100,-1,222,1111111,-111111};
        int[]out=new int[nums.length];
        Arrays.fill(out,Integer.MIN_VALUE);
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<nums.length;i++){
            while(!st.isEmpty()&&nums[i]>nums[st.peek()]){
                out[st.peek()]=nums[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<out.length;i++){
            int j=0;
            while(out[i]==Integer.MIN_VALUE&&j!=i){
                if(nums[i]<nums[j]){
                    out[i]=nums[j];
                    break;
                }
                j++;
            }
        }
        for(int i=0;i<out.length;i++){
            if(out[i]==Integer.MIN_VALUE) out[i]=-1;
        }
        System.out.println(Arrays.toString(out));
    }
}
