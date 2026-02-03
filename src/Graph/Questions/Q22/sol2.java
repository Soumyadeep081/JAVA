package Graph.Questions.Q22;

import java.util.*;

public class sol2 {
    public static void main(String[] args) {
        //Using DisJoint Set:
        int n=4;
        int[][]connections={{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(n,connections));
    }
        static class DSU{
             List<Integer>parent=new ArrayList<>();
             List<Integer>rank=new ArrayList<>();
            DSU(int n){
                for(int i=0;i<n;i++){
                    parent.add(i);
                    rank.add(0);
                }
            }
            public  int findParent(int u){
                if(parent.get(u)==u)return u;
                int ulp=findParent(parent.get(u));
                parent.set(u,ulp);
                return ulp;
            }
            public  void union(int u,int v){
                int ulp_u=findParent(u);
                int ulp_v=findParent(v);
                if(ulp_u==ulp_v)return;
                if(rank.get(ulp_v)>rank.get(ulp_u)){
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
        public static int makeConnected(int n, int[][] connections) {
            DSU dsu=new DSU(n);
            if(n-1>connections.length)return -1;
            int num=n;
            for(int[]edge:connections){
                int u=edge[0],v=edge[1];
                if(dsu.findParent(u)!=dsu.findParent(v)){
                    dsu.union(u,v);
                    num--;
                }
            }
            return num-1;
        }

}
