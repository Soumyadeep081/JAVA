package Array.Questions;
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        //Two Sum:
        int[]a={2,7,11,13};
        int target=9;
     HashMap<Integer,Integer>hm=new HashMap<>();
     for(int i=0;i<a.length;i++){
         int comp=target-a[i];
         if(hm.containsKey(comp)){
             System.out.println(Arrays.toString(new int[]{hm.get(comp), i}));
             return;
         }
         hm.put(a[i],i);
     }
        System.out.println(Arrays.toString(new int[0]));
    }
}
