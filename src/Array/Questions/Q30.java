package Array.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q30 {
    public static void main(String[] args) {
        //3Sum:
        int[]nums={-1,0,1,2,-1,-4};

        Arrays.sort(nums);
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int tot=nums[i]+nums[j]+nums[k];
                if(tot<0)j++;
                else if(tot>0)k--;
                else{
                    ll.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(j<k&&nums[j]==nums[j-1])j++;
                }
            }
        }
        System.out.println(ll);
    }
}
