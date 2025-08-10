package TwoPointers_Or_SlidingWindow;

import java.util.HashMap;


public class Q14 {
    public static void main(String[] args) {
        //Fruits into baskets:
        int[] f={0,1,2,2};
        int left=0,max=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int right=0;right<f.length;right++){
            hm.put(f[right],hm.getOrDefault(f[right],0)+1);
            while(hm.size()>2){
                hm.put(f[left],hm.get(f[left])-1);
                if(hm.get(f[left])==0) hm.remove(f[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
