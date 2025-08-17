package Searching;

public class Q9 {
    public static void main(String[] args) {
        //Search in rotated sorted array:

        int[]a={4,5,6,7,0,1,2};
        int x=0;
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x) {
                System.out.println(mid);
                return;
            }
            else if(a[mid]>=a[low]){
                if(x>=a[low]&&x<a[mid]){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else {
                if(x>a[mid]&&x<=a[high])  low=mid+1;
                else high=mid-1;
            }
        }
        System.out.println(-1);
    }
}
