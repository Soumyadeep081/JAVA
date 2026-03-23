package TwoPointers_Or_SlidingWindow;

public class Q21 {
    public static void main(String[] args) {
        //Maximum Points You Can Obtain from Cards:
        int[]cardPoints={1,2,3,4,5,6,1};
        int k=3;


        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        int max=leftsum;
        int rightsum=0;
        for(int i=0;i<k;i++){
            leftsum-=cardPoints[k-1-i];
            rightsum+=cardPoints[cardPoints.length-1-i];
            max=Math.max(max,leftsum+rightsum);
        }
        System.out.println(max);
    }
}
