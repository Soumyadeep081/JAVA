package Greedy.Q2;

public class Optimal {
    public static void main(String[] args) {
        //Minimum product subset of an array:

        int[]a={-1,-1,-2,4,3};
        int n=5;

        System.out.println(f(a,n));
    }
    public static int f(int[]a,int n){
        if(n==1)return a[1];

        int count_neg=0,count_zero=0;
        int neg_max=Integer.MIN_VALUE;
        int pos_min=Integer.MAX_VALUE;

        int product=1;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                neg_max=Math.max(neg_max,a[i]);
                count_neg++;
            }
            else if(a[i]==0)count_zero++;
            else if(a[i]>0){
                pos_min=Math.min(a[i],pos_min);
            }
            product*=a[i];
        }

        if(count_zero==n||(count_zero!=0&&count_neg==0))return 0;

        if(count_zero==0&&count_neg==0)return pos_min;

        if(count_neg%2==0&&count_neg>0)return product/neg_max;

        return product;
    }
}
