package Searching;

public class Q12 {
    public static void main(String[] args) {
        // Single Element in a Sorted Array:

        int[]a={1,1,2,3,3,4,4,8,8};
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int lb=lwr(a,a[mid]);
            int ub=upr(a,a[mid]);
            if(ub-lb==1){
                System.out.println(a[mid]);
                return;
            }
            if(lb%2==0) low=ub;
            else high=lb-1;
        }
        System.out.println(-1);

    }
    private static int lwr(int[]a,int x){
        int low=0,high=a.length;
        while(low<high){
            int mid=(low+high)/2;
            if(a[mid]>=x) high=mid;
            else low=mid+1;
        }
        return low;
    }
    private static int upr(int[]a,int x){
        int low=0,high=a.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(a[mid]<=x) low=mid+1;
            else high=mid;
        }
        return high;
    }
}
