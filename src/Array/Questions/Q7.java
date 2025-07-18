package Array.Questions;

public class Q7 {
    public static void main(String[] args) {
        //Build Array from Permutation:
        int[]nums={0,2,1,5,3,4};
        for(int num:buildArray(nums)){
            System.out.printf("%d\t",num);
        }
    }
    public static int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }
}
