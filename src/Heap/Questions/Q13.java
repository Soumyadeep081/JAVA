package Heap.Questions;

import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        //Task Scheduler:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        char[]tasks=new char[n];
        for(int i=0;i<n;i++){
            tasks[i]=input.next().charAt(0);
        }
        int k=input.nextInt();

        System.out.println(f(tasks,k));
    }
    public static int f(char[]tasks,int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;
        for (int f : freq) if (f > 0) pq.add(f);
        int time = 0;
        while (!pq.isEmpty()) {
            List<Integer> remain = new ArrayList<>();
            int cycle = n + 1;
            while (cycle > 0 && !pq.isEmpty()) {
                int count = pq.poll();
                if (count > 1) remain.add(count - 1);
                time++;
                cycle--;
            }
            for (int r : remain) pq.add(r);
            if (pq.isEmpty()) break;
            time += cycle;
        }
        return time;
    }
}
