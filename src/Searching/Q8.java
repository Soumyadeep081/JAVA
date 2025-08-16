package Searching;

public class Q8 {
    public static void main(String[] args) {
        //Count occurrences of a number in a sorted array with duplicates:

        int[]arr={0,1,1,1,2,2,3,3,3,4};
        int target=1;

                int lb=lowerBound(arr,target);
                int ub=upperBound(arr,target);
        System.out.println(ub-lb);
            }
            private static int lowerBound(int[]arr,int x){
                int low=0,high=arr.length;
                while(low<high){
                    int mid=(low+high)/2;
                    if(arr[mid]>=x) high=mid;
                    else low=mid+1;
                }
                return low;
            }
            private static int upperBound(int[]arr,int x){
                int low=0,high=arr.length;
                while(low<high){
                    int mid=(low+high)/2;
                    if(arr[mid]>x) high=mid;
                    else low=mid+1;
                }
                return high;
            }



}
