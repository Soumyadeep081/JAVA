package Array.Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Q12 {
    public static void main(String[] args) {
        //How Many Numbers Are Smaller Than the Current Number:
        int[]nums={8,1,2,2,3};
        int[] result=new int[nums.length];

        //Approach 1:Brute Force:
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]) c++;
            }
            result[i]=c;
        }
        for(int num:result){
            System.out.println(num);
        }
        System.out.println("----------------------------------------");
        //Approach 2: Using HashMap:
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[]copy=nums.clone();
        Arrays.sort(copy);
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(copy[i])){ //Ensuring No duplication since hashmap do not allow duplicate elements.
                hm.put(copy[i],i);
            }
        }
        for(int i=0;i<nums.length;i++){
            result[i]=hm.get(nums[i]);
        }
        for(int num:result){
            System.out.println(num);
        }

    }
}
