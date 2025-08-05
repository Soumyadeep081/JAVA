package Array.Questions;

public class Q27 {
    public static void main(String[] args) {
        //Find First and Last Position of Element in Sorted Array:
        int[]a={5,7,7,8,8,10};
        int target=8;
        int left=0,right=a.length-1;
        int index1=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(a[mid]>=target) right=mid-1;
            else left=mid+1;
            if(target==a[mid]) index1=mid;
        }
        int index2=-1;
        left=0;
        right=a.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(a[mid]<=target) left=mid+1;
            else right=mid-1;
            if(a[mid]==target) index2=mid;
        }
        int[]result={index1,index2};
        for(int num:result) System.out.println("["+num+"]");
    }
}
