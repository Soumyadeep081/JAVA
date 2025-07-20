package Array.Questions;

public class Q17 {
    public static void main(String[] args) {
        //Find Numbers with Even Number of Digits:
        int[]nums={12,345,2,6,7896};
        int c=0,count=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            while(nums[i]>0){
                c++;
                nums[i]=nums[i]/10;
            }
            if(c%2==0) count++;
        }
        System.out.println(count);
    }
}
