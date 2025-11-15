package Greedy.Q16;

import java.util.*;

public class sol {
    public static void main(String[] args) {

        int[][]a={{1,3}, {2,6} ,{8,10} ,{8,9}, {9,11},{15,18}, {2,4} ,{16,17}};

        System.out.println(Arrays.deepToString(merge(a)));

    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length==1)return intervals;
        Arrays.sort(intervals,(a, b)->a[0] - b[0]);
        List<int[]>ll=new ArrayList<>();
        int last=intervals[0][1];
        int first=intervals[0][0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=last){
                last=Math.max(last,intervals[i][1]);
            }
            else{
                ll.add(new int[]{first,last});

                first=intervals[i][0];
                last=intervals[i][1];
            }
        }
        ll.add(new int[]{first,last});

        return ll.toArray(new int[0][]);
    }
}
