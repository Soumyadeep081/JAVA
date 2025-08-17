package Searching;

public class Q11 {
    public static void main(String[] args) {
        //Find Minimum in Rotated Sorted Array:

        int[]a={3,4,5,1,2};
        int x=1;

        int low=0,high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[low]<a[high]) {
                System.out.println(a[low]);
                return;
            }
            if(mid-1>=0 && a[mid]<a[mid-1]) {
                System.out.println(a[mid]);
                return;
            }
            if(mid+1<a.length&&a[mid]>a[mid+1]){
                System.out.println(a[mid+1]);
                return;
            }
            if(a[low]<a[mid]) low=mid+1;
            else high=mid-1;
        }
        System.out.println(-1);
    }
}
