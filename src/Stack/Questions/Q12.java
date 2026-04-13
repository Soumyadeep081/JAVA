package Stack.Questions;

public class Q12 {
    public static void main(String[] args) {
        //Trapping Rainwater:
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int left=0,right=height.length-1;
        int c=0;
        int leftMax=height[left],rightMax=height[right];
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,height[left]);
                c+=leftMax-height[left];
            }
            else{
                right--;
                rightMax=Math.max(rightMax,height[right]);
                c+=rightMax-height[right];
            }
        }
        System.out.println(c);

    }
}
