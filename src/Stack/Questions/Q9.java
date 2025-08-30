package Stack.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q9 {
    public static void main(String[] args) {
        //Previous Smaller Element:

        int[]nums1={4,1,2},nums2={2,4,3,1};
        Stack<Integer> st=new Stack<>();
        st.push(nums2.length-1);
        int[]out=new int[nums2.length];
        for(int i=nums2.length-2;i>=0;i--){
            while(!st.isEmpty()&&nums2[i]<nums2[st.peek()]){
                out[st.peek()]=nums2[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            out[st.peek()]=-1;
            st.pop();
        }
        System.out.println(Arrays.toString(out));
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[]out2=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],out[i]);
        }
        for(int i=0;i<nums1.length;i++){
            out2[i]=hm.get(nums1[i]);
        }

        System.out.println(Arrays.toString(out2));
    }
}
