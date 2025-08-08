package TwoPointers_Or_SlidingWindow;

public class Q12 {
    public static void main(String[] args) {
        //Max Consecutive Ones III:

        int[]a={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int left=0,max=0,zero=0;
        for(int right=0;right<a.length;right++){
            if(a[right]==0) zero++;
            while(zero>k){
                if(a[left]==0) zero--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
