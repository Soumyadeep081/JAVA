package Array.Questions;
import java.util.*;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        //Intersection of Arrays:
        int[]a={4,5,9};
        int[]b={4,2,3,9,8,9,4};
        for(int num:inter(a,b)){
            System.out.printf("%d\t",num);
        }
    }
    static int[] inter(int[]a,int[]b) {

        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                arr.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) i++;
            else j++;
        }
        List<Integer> uniqueList = arr.stream().distinct().collect(Collectors.toList());
        int[] result = new int[uniqueList.size()];
        for (int k = 0; k < uniqueList.size(); k++) {
            result[k] = uniqueList.get(k);
        }
    return result;
    }
}
