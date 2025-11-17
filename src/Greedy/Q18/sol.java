package Greedy.Q18;

import java.util.*;

public class sol {
    static class pair{
        int start;
        int end;
        public pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static void main(String[] args) {
        int[]start={0,1,3,5,8,5};
        int[]end={2,4,5,7,9,9};

        System.out.println(f(start,end));
    }
    public static int f(int[]start,int[]finish){
        List<pair> ll=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            ll.add(new pair(start[i],finish[i]));
        }
        ll.sort(Comparator.comparingInt(a->a.end));

        int count=1;
        int last=ll.get(0).end;

        for(int j=1;j<start.length;j++){
            if(ll.get(j).start>last){
                count++;
                last=ll.get(j).end;
            }

        }
        return count;
    }
}
