package Graph.Implementation;

import java.util.LinkedList;

public class AdjacencyList {
   public static class Graph{

        public int v;
        public LinkedList<Integer>[] adj;

        public Graph(int v){
            this.v=v;
            adj=new LinkedList[v];

            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<>();
            }
        }
        public void addEdge(int u,int v,boolean bidir){
            adj[u].add(v);
            if(bidir)adj[v].add(u);
        }

        public void display(){
            for(int i=0;i<adj.length;i++){
                System.out.print("["+i+"->");
                for (int node:adj[i]){
                    System.out.print(node+"->");
                }
                System.out.print("x]"+"\n");
            }
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph(8);
        g.addEdge(2,1,true);
        g.addEdge(2,3,false);
        g.addEdge(2,5,false);
        g.addEdge(6,2,false);
        g.addEdge(6,7,false);
        g.addEdge(7,5,false);
        g.addEdge(4,3,false);
        g.addEdge(4,7,false);


        g.display();

    }
}
