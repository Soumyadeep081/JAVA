package Searching;

public class Q5 {
    public static void main(String[] args) {
        //Search Insert Position:

        int[]a={1,3,5,6};
        int x=2;
        int low=0,high=a.length;
        while(low<high){
            int mid=(low+high)/2;
            if(a[mid]==x){
                System.out.println(mid);
                return;
            }
            else if(a[mid]>x) high=mid;
            else low=mid+1;
        }
        System.out.println(high);
    }
}
