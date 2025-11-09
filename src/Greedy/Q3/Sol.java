package Greedy.Q3;

public class Sol {
    public static void main(String[] args) {
            int[]a={7,1,5,3,6,4};

            System.out.println(f(a));
        }
        public static int f(int[]a){
            int min=a[0];
            int profit=0;
            for(int i=1;i<a.length;i++){
                if(min<a[i])profit+=a[i]-min;
                min=a[i];
            }
            return profit;

    }
}
