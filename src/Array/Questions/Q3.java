package Array.Questions;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        //Maximum and Minimum element in an array:
        int[]a={3,1,2,4,5};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max) max=a[i];
            if(a[i]<min) min=a[i];
        }
        System.out.println("Maximum="+max);
        System.out.println("Minimum="+min);
    }
}
