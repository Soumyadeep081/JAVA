package TwoPointers_Or_SlidingWindow;

public class Q7 {
    public static void main(String[] args) {
        // Max Consecutive Ones
        int[]a={1,1,0,1,1,1,0,1};
        int max=0,curr=0;
        for(int num:a){
            if(num==1){
                curr++;
                max=Math.max(max,curr);
            }
            else curr=0;
        }
        System.out.println(max);
    }
}
