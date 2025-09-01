package Stack.Questions;

import java.util.Stack;

public class Q11 {
    public static void main(String[] args) {
        int[]heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

            public static int[] rse(int[] a){
                Stack<Integer> stack=new Stack<>();
                int[] output=new int[a.length];
                for(int i=a.length-1;i>=0;i--){
                    while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                        stack.pop();
                    }
                    output[i]=stack.isEmpty()?a.length:stack.peek();
                    stack.push(i);
                }
                return output;
            }
            public static int[] lse(int[]a){
                Stack<Integer> stack=new Stack<>();
                int[] output=new int[a.length];
                for(int i=0;i<a.length;i++){
                    while(!stack.isEmpty() && a[stack.peek()] >= a[i] ){
                        stack.pop();
                    }
                    output[i]=stack.isEmpty()?-1:stack.peek();
                    stack.push(i);
                }
                return output;
            }
            public static int largestRectangleArea(int[] heights) {
                int[] rsse=rse(heights);
                int[] lsse=lse(heights);
                int maxArea=0;
                for(int i=0;i<heights.length;i++){
                    int area = heights[i] * (rsse[i] - lsse[i] - 1);
                    maxArea = Math.max(maxArea, area);
                }
                return maxArea;
            }

        }



