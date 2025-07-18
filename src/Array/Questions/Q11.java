package Array.Questions;

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandy=3;
        int max=0;
        List<Boolean> arr=new ArrayList<>();
        for(int num:candies){
            if(num> max) max=num;
        }
        for(int candy:candies){
            arr.add(candy+extraCandy>=max);
        }
        System.out.println(arr);
    }
}
