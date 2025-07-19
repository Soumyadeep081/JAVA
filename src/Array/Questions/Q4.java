package Array.Questions;

public class Q4 {
    public static void main(String[] args) {
        //Number of Good Pairs:
    int[]nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));

    }
    public static int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}
