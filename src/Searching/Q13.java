package Searching;

import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        //Bishu and Soldiers:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=input.nextInt();
        Arrays.sort(arr);
        int[]pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        int q=input.nextInt();
        while(q-->0){
            int pow=input.nextInt();
            int idx=f(arr,pow);
            if(idx==-1){
                System.out.println(0+" "+0);
                return;
            }
            System.out.println(idx+1+" "+pre[idx]);
        }
    }
    static int f(int[]arr,int x){
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]<=x){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }

}
