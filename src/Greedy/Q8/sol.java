package Greedy.Q8;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[][]a={{1,3},{2,2},{3,1}};
        int truckSize=4;

        System.out.println(f(a,truckSize));

    }
    public static int f(int[][]a,int truckSize){
        Arrays.sort(a,(p, q)->q[1] - p[1]);
        int total=0;
        for(int[]box:a){
            if(truckSize>=box[0]){
                total+=(box[0]*box[1]);
                truckSize-=box[0];
            }
            else{
                total+=truckSize*box[1];
                break;
            }
        }
        return total;
    }
}
