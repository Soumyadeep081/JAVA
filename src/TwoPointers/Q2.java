package TwoPointers;

public class Q2 {
    public static void main(String[] args) {
        //Remove Element:
        int[]a={3,2,2,3};
        int target=3;
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=target){
                a[i]=a[j];
                i++;
            }
        }
        System.out.println(i);
    }
}
