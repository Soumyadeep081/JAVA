package Greedy.Q27;

public class sol {
    public static void main(String[] args) {
      int[]gas={1,2,3,4,5};
      int[]cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
public static int canCompleteCircuit(int[] gas, int[] cost) {
    int sum=0;
    int total=0;
    int start=0;
    int n=gas.length;
    for(int i=0;i<n;i++){
        sum+=gas[i]-cost[i];
        total+=gas[i]-cost[i];
        if(total<0){
            total=0;
            start=i+1;
        }
    }
    return sum<0?-1:start;
}
}
