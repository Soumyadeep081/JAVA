package Graph.Implementation.DisJointSet;

import java.util.*;

public class unionByRank {
    static class DisjointSet{
        static List<Integer>parent=new ArrayList<>();
        static List<Integer>rank=new ArrayList<>();
        public DisjointSet(int n){
            for(int i=0;i<=n;i++){
                parent.add(i);
                rank.add(0);
            }
        }

        public static int findParent(int node){
            if(node==parent.get(node))return node;
            int ulp=findParent(parent.get(node));
            parent.set(node,ulp);
            return parent.get(node);
        }
        public static void unionByRank(int u,int v){
            int ulp_u=findParent(u);
            int ulp_v=findParent(v);
            if(ulp_u==ulp_v)return;
            if(rank.get(ulp_u)<rank.get(ulp_v)){
                parent.set(ulp_u,ulp_v);
            }
            else if(rank.get(ulp_v)<rank.get(ulp_u)){
                parent.set(ulp_v,ulp_u);
            }
            else{
                parent.set(ulp_v,ulp_u);
                int rankU=rank.get(ulp_u);
                rank.set(ulp_u,rankU+1);
            }
        }

    }
    public static void main (String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);
        if (ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
