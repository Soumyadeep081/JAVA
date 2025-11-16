package Greedy.Q17;

import java.util.*;

public class sol {
    static class pair{
        int val;
        int wt;
        double frac;
        public pair(int val,int wt){
            this.val=val;
            this.wt=wt;
            this.frac=(double)val/wt;
        }
        }
    public static void main(String[] args) {

        int[]val={60,100,120};
        int[]wt={10,20,30};

        long cap=50;
        System.out.println(f(val,wt,cap));
    }
    public static double f(int[]val,int[]wt,long cap){
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->Double.compare(b.frac,a.frac));
        for(int i=0;i<val.length;i++){
            pq.add(new pair(val[i],wt[i]));

        }
        double ans=0;
        while(cap>0&&!pq.isEmpty()){
            pair p =pq.poll();
            if(p.wt<=cap){
                ans+=p.frac*p.wt;
                cap-=p.wt;
            }
            else{
                ans+=p.frac*cap;
                cap=0;
            }
        }
        return ans;
    }
}
