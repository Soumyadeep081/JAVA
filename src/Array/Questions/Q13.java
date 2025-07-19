package Array.Questions;
import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        //Create Target Array in the Given Order
        int[] a = {0, 1, 2, 3, 4}, b = {0, 1, 2, 2, 1};
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            l.add(b[i],a[i]);
        }
        int[] result=new int[l.size()];
        for(int i=0;i<l.size();i++){
            result[i]=l.get(i);
        }
        for(int num:result) System.out.println(num);
    }
}
