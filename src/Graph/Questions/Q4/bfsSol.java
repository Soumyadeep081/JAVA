package Graph.Questions.Q4;

import java.util.*;


public class bfsSol {
    public static void main(String[] args) {
        List<List<Integer>>rooms=new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));


        System.out.println(canVisitAllRooms(rooms));
    }
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[]unlocked=new boolean[rooms.size()];
        Queue<Integer>q=new LinkedList<>();
        unlocked[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbr:rooms.get(node)){
                if(!unlocked[nbr]){
                    unlocked[nbr]=true;
                    q.add(nbr);
                }
            }
        }
        for(int i=0;i<rooms.size();i++){
            if(!unlocked[i])return false;
        }
        return true;
    }
}
