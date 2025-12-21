package Graph.Questions.Q17;
import java.util.*;
public class sol {
    public static void main(String[] args) {
        int n=4;
        int[][]prerequisites={{1,0},{2,0},{3,1},{3,2}};

        System.out.println(Arrays.toString(findOrder(n, prerequisites)));
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]indegree=new int[numCourses];
        int[]res=new int[numCourses];
        Queue<Integer>q=new LinkedList<>();
        List<Integer>[]graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[]arr:prerequisites){
            graph[arr[1]].add(arr[0]);
            indegree[arr[0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)q.add(i);
        }
        int i=0;
        while(!q.isEmpty()){
            int node=q.poll();
            res[i++]=node;
            for(int nbr:graph[node]){
                indegree[nbr]--;
                if(indegree[nbr]==0)q.add(nbr);
            }
        }

        if(i!=numCourses)return new int[0];

        return res;
    }
}
