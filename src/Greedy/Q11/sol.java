package Greedy.Q11;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        int[]g={1,2,3};
        int[]s={1,1};

        System.out.println(f(g,s));
    }
    public  static int f(int[]g,int[]s){
        Arrays.sort(g);
        Arrays.sort(s);

        int c=0;
        int i=0;
        int j=0;
        int m=g.length;
        int n=s.length;
        while(i<m&&j<n){
            if(s[j]>=g[i]){
                c++;
                i++;
                j++;
            }
            else j++;
        }
        return c;
    }
}
