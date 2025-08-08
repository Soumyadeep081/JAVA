package TwoPointers;

public class Q8 {
    public static void main(String[] args) {
        //Maximum Average Subarray I:
        int[]a={1,12,-5,-6,50,3};
        int k=4;

        int sum=0;
        int left=0,right=k-1;
        for(int i=left;i<=right;i++){
            sum+=a[i];
        }
        double max=sum;
        right++;
        while(right<a.length){
            sum=sum-a[left++]+a[right++];
            max=Math.max(max,sum);
        }
        System.out.println(max/k);
    }
}
