package Array.Questions;

public class Q26 {
    public static void main(String[] args) {
        // Product of Array Except Self:
        int[] nums={1,2,3,4};
        int n=nums.length;
        int[]ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];  //left=[1,1,2,6]
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*nums[i]; //right=[1,4,12,24]
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d\t",ans[i]); //ans=[1*24,1*12,2*4,6*1]
        }
    }
}
