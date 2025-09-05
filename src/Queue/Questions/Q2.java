package Queue.Questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        //Given a stream of characters, find the first non-repeating character from the stream:

        String s="abacacca";
        HashMap<Character,Integer>hm=new HashMap<>();
        Queue<Character>q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                q.add(ch);
                while(!q.isEmpty()&&hm.get(q.peek())>1) q.poll();
                if(q.isEmpty()) sb.append("-1");
                else sb.append(q.peek());

        }
        System.out.println(sb.toString());
    }
}
