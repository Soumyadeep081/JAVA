package HashMap.Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        //Longest Consecutive Sequence:
        int[]a={2,12,9,16,10,5,3,20,25,11,1,8,6};
        HashMap<Integer,Boolean>hm=new HashMap<>();
        for (int j : a) {
            hm.put(j, true);
        }
        for(int num:a){
            if(hm.containsKey(num-1))hm.replace(num,false);
        }

        int maxLen=0;
        int maxStart=Integer.MIN_VALUE;
        for(int num:hm.keySet()){
            if(hm.get(num)){
                int count=1;
                while(hm.containsKey(num+count)){
                    count++;
                }
                if(count>maxLen){
                    maxLen=count;
                    maxStart= num;
                }
            }
        }
        int[]res=new int[maxLen];

        for(int i=0;i<maxLen;i++){
            res[i]=maxStart+i;
        }
        System.out.println("Longest consecutive Sequence is: "+ Arrays.toString(res)+" which has a length: "+maxLen);

    }
}
