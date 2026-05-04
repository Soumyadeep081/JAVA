package Queue.Questions;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        //Number of operations to make array empty:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        //Approach 1: Using queue(O(n^2)) [due to continuous finding min]
        Queue<Integer>q=new LinkedList<>();
        for(int num:nums)q.add(num);
        int ops=0;
        while(!q.isEmpty()){
            int min=Collections.min(q);
            if(q.peek().equals(min)){
                q.poll();
            }
            else{
                q.add(q.poll());
            }
            ops++;
        }
        System.out.println(ops);


        //Approach 2: Using queue + priority queue [also O(n^2) but somewhat better than app 1]
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Queue<Integer>q2=new LinkedList<>();
        for(int num:nums){
            q2.add(num);
            pq.add(num);
        }
        int ops2=0;
        while(!q2.isEmpty()){
            if(pq.peek().equals(q2.peek())){
                q2.poll();
                pq.poll();
            }
            else{
                q2.add(q2.poll());
            }
            ops2++;
        }
        System.out.println(ops2);

        //Approach 3: Using priority queue + linked list [same as app 2]
        LinkedList<Integer>ll=new LinkedList<>();
        PriorityQueue<Integer>pq2=new PriorityQueue<>();
        for(int num:nums){
            pq2.add(num);
            ll.add(num);
        }
        int ops3=0;
        while(!ll.isEmpty()){
            if(pq2.peek().equals(ll.getFirst())){
                pq2.poll();
                ll.removeFirst();
            }
            else{
                ll.addLast(ll.removeFirst());
            }
            ops3++;
        }
        System.out.println(ops3);
    }
}
