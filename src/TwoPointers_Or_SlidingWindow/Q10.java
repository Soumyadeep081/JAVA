package TwoPointers_Or_SlidingWindow;

public class Q10 {
    public static void main(String[] args) {


        //Maximum Points You Can Obtain from Card:
        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int leftsum = 0, rightsum = 0;
        for (int i = 0; i < k; i++) {
            leftsum+=cards[i];

        }
        int max=leftsum;
        for(int i=0;i<k;i++){
            leftsum-=cards[k-1-i];
            rightsum+=cards[cards.length-1-i];
            max=Math.max(max,leftsum+rightsum);
        }
        System.out.println(max);
    }
}
