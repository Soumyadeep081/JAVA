package Graph.Questions.Q23;

import java.util.*;

public class sol2 {
    public static void main(String[] args) {
        //Using union by rank:
        int[][]stones={{0,0},{0,1},{1,2},{2,1},{1,0},{2,2}};

        System.out.println(countStones(stones));
    }
   static class DSU{
        List<Integer>parent=new ArrayList<>();
        List<Integer>size=new ArrayList<>();
        DSU(int n){
            for(int i=0;i<n;i++){
                parent.add(i);
                size.add(1);
            }
        }
        public int findParent(int u){
            if(parent.get(u)==u)return u;
            int ulp=findParent(parent.get(u));
            parent.set(u,ulp);
            return ulp;
        }
        public void union(int u,int v){
            int ulp_u=findParent(u),ulp_v=findParent(v);
            if(ulp_v==ulp_u)return;
            if(size.get(ulp_v)>size.get(ulp_u)){
                parent.set(ulp_u,ulp_v);
                size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
            }
            else{
                parent.set(ulp_v,ulp_u);
                size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
            }
        }
    }
    public static int countStones(int[][]stones){
        int maxR=0,maxC=0;
        for(int[]stone:stones){
            maxR=Math.max(maxR,stone[0]);
            maxC=Math.max(maxC,stone[1]);
        }
        int size=maxR+maxC+2;
        DSU dsu=new DSU(size);
        Set<Integer>nodes=new HashSet<>();

        for(int[]stone:stones){
            int u=stone[0],v=stone[1]+maxR+1;
            dsu.union(u,v);
            nodes.add(u);
            nodes.add(v);
        }
        int cmp=0;
        for(int node:nodes){
            if(dsu.findParent(node)==node)cmp++;
        }
        return stones.length-cmp;
    }
}
