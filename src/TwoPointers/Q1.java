package TwoPointers;

public class Q1 {
    public static void main(String[] args) {
        //Remove Duplicates from Sorted Array:
        int[]a={0,0,1,1,1,2,2,3,3,4};
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        System.out.println(i+1);
    }
}
