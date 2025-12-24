package Greedy.Q24;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[]apple={1,3,2};
        int[]capacity={4,3,1,5,2};

        System.out.println(minimumBoxes(apple,capacity));
    }
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int num:apple)sum+=num;
        Arrays.sort(capacity);
        int c=1;
        int total=capacity[capacity.length-1];
        for(int i=capacity.length-2;i>=0;i--){
            if(sum<=total)break;
            else{
                total+=capacity[i];c++;
            }
        }
        return c;
    }
}
