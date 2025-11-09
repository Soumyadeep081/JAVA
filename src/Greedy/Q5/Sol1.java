package Greedy.Q5;

import java.util.*;

public class Sol1 {
    static class pair{
        int arr;
        int dep;
        public pair(int arr,int dep){
            this.arr=arr;
            this.dep=dep;
        }
    }
    public static void main(String[] args) {
        int[]arr={900, 940, 950, 1100, 1500, 1800};
        int[]dep={910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minPlatform(arr,dep));
    }
    public static int minPlatform(int arr[], int dep[]) {
        //  code here
        List<pair> ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ll.add(new pair(arr[i],dep[i]));
        }

        ll.sort(Comparator.comparingInt(a->a.arr));
        PriorityQueue<Integer>q=new PriorityQueue<>();
        q.add(ll.get(0).dep);
        int c=1;

        for(int i=1;i<arr.length;i++){
            while(!q.isEmpty()&&q.peek()<ll.get(i).arr)q.poll();
            q.add(ll.get(i).dep);
            c=Math.max(c,q.size());
        }
        return c;
    }

}
