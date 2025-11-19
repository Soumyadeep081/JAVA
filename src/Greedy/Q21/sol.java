package Greedy.Q21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sol {
    public static void main(String[] args) {
        int[][]intervals={{1,3},{6,9}};
        int[]newInterval={2,5};

        System.out.println(Arrays.deepToString(f(intervals,newInterval)));
    }
    public static int[][] f(int[][]intervals,int[]newInterval){
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);

        intervals=list.toArray(new int[list.size()][]);
        Arrays.sort(intervals,(a,b)->a[0] - b[0]);

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
