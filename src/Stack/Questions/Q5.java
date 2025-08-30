package Stack.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        //Next Greater Element:

        int[]nums1={4,1,2},nums2={1,3,4,2};

        HashMap<Integer,Integer>hm=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        st.push(0);
        int[]out1=new int[nums2.length],out2=new int[nums1.length];
        for(int i=1;i<nums2.length;i++){
            while(!st.isEmpty()&&nums2[i]>nums2[st.peek()]){
                out1[st.peek()]=nums2[i];
                st.pop();
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            out1[st.pop()]=-1;
        }
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],out1[i]);
        }
        for(int i=0;i<nums1.length;i++){
            out2[i]=hm.get(nums1[i]);
        }
        System.out.println(Arrays.toString(out2));
    }
}
