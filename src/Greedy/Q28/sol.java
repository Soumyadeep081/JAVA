package Greedy.Q28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sol {
    static class Alien {
        int a, b, d;
        Alien(int a, int b, int d) {
            this.a = a;
            this.b = b;
            this.d = d;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[][]aliens=new int[n][3];
        for(int i=0;i<aliens.length;i++){
            for(int j=0;j<aliens[0].length;j++){
                aliens[i][j]=input.nextInt();
            }
        }

        List<Alien>aliens1=new ArrayList<>();
        for(int i=0;i<aliens.length;i++){
            aliens1.add(new Alien(aliens[i][0],aliens[i][1],aliens[i][2]));
        }
        Collections.sort(aliens1, (x, y) -> x.a - y.a);
        int ans = solve(aliens1, 0);
        System.out.println(ans);
    }
    static int solve(List<Alien> aliens, int i) {
        if (i == aliens.size()) return 0;

        int minCost = Integer.MAX_VALUE;

        int maxDist = 0;
        int start = aliens.get(i).a;
        int end = aliens.get(i).b;

        for (int j = i; j < aliens.size(); j++) {
            Alien cur = aliens.get(j);

            start = Math.max(start, cur.a);
            end = Math.min(end, cur.b);

            if (start > end) break;

            maxDist = Math.max(maxDist, cur.d);

            int cost = maxDist + solve(aliens, j + 1);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}
