package Array.Questions;

import java.util.LinkedList;

public class Q19 {
    public static void main(String[] args) {
        //Add to Array-Form of Integer:
        int[]a={1,2,0,0};int k=34;
        LinkedList<Integer>ll=new LinkedList<>();
        int n=a.length-1;
        while(n>=0 || k>0){
            if(n>=0){
                k+=a[n];
                n--;
            }
            ll.addFirst(k%10);
            k=k/10;
        }
        System.out.println(ll);
    }
}
