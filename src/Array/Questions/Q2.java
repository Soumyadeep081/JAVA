package Array.Questions;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        //Reverse of an array:
        int[]a={3,2,1,4,5};
        System.out.println("Original Array: ");
        for(int num: a){
            System.out.printf("%d\t",num);
        }

        System.out.println("\nReverse array: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.printf("%d\t",a[i]);
        }
    }
}
