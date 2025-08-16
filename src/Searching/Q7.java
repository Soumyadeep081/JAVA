package Searching;

public class Q7 {
    public static void main(String[] args) {
        //Find First and Last Position of Element in Sorted Array:
        int[]a={5,7,7,8,8,10};
        int x=8;
        int low=0,high=a.length-1;
        int index1=-1,index2=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>=x) high=mid-1;
            else low=mid+1;
            if(a[mid]==x) index1=mid;
        }
        int low2=0,high2=a.length-1;
        while(low2<=high2){
            int mid=(low2+high2)/2;
            if(a[mid]<=x) low2=mid+1;
            else high2=mid-1;
            if(a[mid]==x) index2=mid;
        }
        System.out.println(index1+" "+index2);
    }
}
