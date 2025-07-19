package Array.Questions;

public class Q10 {
    public static void main(String[] args) {
        //Shuffle the Array:
    int[]nums={2,5,1,3,4,7};
    int n=3;
    for(int num:shuffle(nums,n)){
        System.out.println(num);
    }

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];
        }
        return result;
    }
}
