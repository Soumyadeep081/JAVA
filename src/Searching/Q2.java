package Searching;

public class Q2 {
    public static void main(String[] args) {
        //Two copiers:
        int n=4;
        int x=1,y=2;
        System.out.println(solution(n,x,y));
    }
    private static  int solution(int n,int x,int y){
        if(n==1) return Math.min(x,y);
        int low=0,high=Math.max(x,y)*n;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(good(mid,x,y,n-1)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans+Math.min(x,y);
    }
    private static boolean good(int mid,int x,int y,int n){
        return ((mid/x)+(mid/y)>=n);
    }
}
