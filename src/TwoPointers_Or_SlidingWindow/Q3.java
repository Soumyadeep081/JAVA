package TwoPointers_Or_SlidingWindow;

public class Q3 {
    public static void main(String[] args) {
        //Merge Sorted Arrays:
        int[]n1={1,2,3,0,0,0};
        int[]n2={2,5,6};
        int m=3,n=n2.length;
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(n1[i]>n2[j]){
                n1[k--]=n1[i--];
            }
            else{
                n1[k--]=n2[j--];
            }
        }
        while(j>=0){
            n1[k--]=n2[j--];
        }
        for(int num:n1){
            System.out.println("["+num+"]");
        }
    }
}
