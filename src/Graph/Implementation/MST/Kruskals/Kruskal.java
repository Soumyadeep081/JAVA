package Graph.Implementation.MST.Kruskals;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class Kruskal {
    static class DSU {
         List<Integer>parent=new ArrayList<>();
         List<Integer>rank=new ArrayList<>();

        public DSU(int n) {
            for (int i = 0; i < n; i++) {
                parent.add(i);
                rank.add(0);
            }
        }

        public int find(int u) {
            if(parent.get(u)==u)return u;
            int ulp=find(parent.get(u));
            parent.set(u,ulp);
            return ulp;
        }

        public void union(int u, int v) {
            int ulp_u=find(u);
            int ulp_v=find(v);
            if(ulp_u==ulp_v)return;
            if(rank.get(ulp_u)<rank.get(ulp_v)){
                parent.set(ulp_u,ulp_v);
            }
            else if(rank.get(ulp_u)>rank.get(ulp_v)){
                parent.set(ulp_v,ulp_u);
            }
            else{
                parent.set(ulp_v,ulp_u);
                int rankU=rank.get(ulp_u);
                rank.set(ulp_u,rankU+1);
            }
        }
    }
    public static int kruskalsMST(int V,int[][] edges){
        Arrays.sort(edges,Comparator.comparingInt(e->e[2]));
        DSU dsu=new DSU(V);
        int cost=0,count=0;
        for(int[] e:edges){
            int x=e[0],y=e[1],w=e[2];
            if(dsu.find(x)!=dsu.find(y)){
                dsu.union(x,y);
                cost+=w;
                if(++count==V-1)break;
            }
        }
        return cost;
    }
    public static void main(String[] args){
        int[][] edges={{0,1,10},{1,3,15},{2,3,4},{2,0,6},{0,3,5}};
        System.out.println(kruskalsMST(4,edges));
    }
}


