package Graph.Questions.Q1;

import java.util.ArrayList;
import java.util.List;

public class sol {
    public static void main(String[] args) {
        //Approach: Simple dfs

        int[][]graph={{1,2},{3},{3},{}};

        System.out.println(findPath(graph));

    }
    public static List<List<Integer>> findPath(int[][]graph){
        List<Integer>path=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        path.add(0);;

        f(graph,0,graph.length-1,path,res);
        return res;
    }

    private static void f(int[][] graph, int start, int end, List<Integer> path, List<List<Integer>> res) {
        if(start==end){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int neighbour:graph[start]){
            path.add(neighbour);
            f(graph,neighbour,end,path,res);
            path.removeLast();
        }
    }
}
