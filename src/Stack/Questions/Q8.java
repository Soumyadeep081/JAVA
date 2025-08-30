package Stack.Questions;

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        //Previous greater element ||:

        int[]nums1={4,1,2},nums2={2,4,3,1};
        ArrayList<Integer>arr=new ArrayList<>();
        for(int num:nums2){
            arr.add(num);
        }
        Collections.reverse(arr);
        for(int i=0;i<arr.size();i++){
            nums2[i]=arr.get(i);
        }
        int[]res=nextGreater(nums2);
        ArrayList<Integer>arr2=new ArrayList<>();
        for(int num : res){
            arr2.add(num);
        }
        Collections.reverse(arr2);
        for(int i=0;i<arr2.size();i++){
            res[i]=arr2.get(i);
        }
        Collections.reverse(arr);
        for(int i=0;i<arr.size();i++){
            nums2[i]=arr.get(i);
        }

        HashMap<Integer,Integer>hm=new HashMap<>();
        int[]out2=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],res[i]);
        }
        for(int i=0;i<nums1.length;i++){
            out2[i]=hm.get(nums1[i]);
        }
        System.out.println(Arrays.toString(out2));

    }
    public static int[] nextGreater(int[]a){
        Stack<Integer>st=new Stack<>();
        int[]out=new int[a.length];
        st.push(0);
        for(int i=1;i<a.length;i++){
            while(!st.isEmpty()&&a[i]>=a[st.peek()]){
                out[st.pop()]=a[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            out[st.pop()]=-1;
        }
        return out;
    }
}
