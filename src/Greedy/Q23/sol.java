package Greedy.Q23;

public class sol {
    public static void main(String[] args) {
        int[]heights={1,8,6,2,5,4,8,3,7};

        System.out.println(f(heights));
    }
    public static int f(int[]height){
        int left=0,right=height.length-1;
        int maxArea=0;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(area,maxArea);

            if(height[left]>height[right])right--;
            else left++;
        }
        return maxArea;
    }
}
