package Stack.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q6 {
    public static void main(String[] args) {
        //Next smaller element:

        int[]nums1={4,1,2},nums2={1,3,4,2};
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[]out=new int[nums2.length];
        st.push(0);
        for(int i=1;i<nums2.length;i++){
            while(!st.isEmpty()&&nums2[i]<=nums2[st.peek()]){
                out[st.peek()]=nums2[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            out[st.peek()]=-1;
            st.pop();
        }
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],out[i]);
        }
        int[]out2=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            out2[i]=hm.get(nums1[i]);
        }
        System.out.println(Arrays.toString(out2));
    }
}
