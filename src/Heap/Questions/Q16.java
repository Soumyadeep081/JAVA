package Heap.Questions;
import java.util.*;
public class Q16 {
    static class pair{
        String word;
        int freq;
        public pair(String word,int freq){
            this.word=word;
            this.freq=freq;
        }
    }
    public static void main(String[] args) {
        //Top K Frequent Words:
        String[]word={"i","love","leetcode","i","love","coding"};
        int k=2;

        System.out.println(topKFrequent(word,k));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }

        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->{
            if(a.freq==b.freq) return b.word.compareTo(a.word);
            return a.freq - b.freq;
        });
        for(Map.Entry<String,Integer>entry:hm.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
            if(pq.size()>k)pq.poll();
        }
        List<String>res=new ArrayList<>();

        while(!pq.isEmpty()){
            res.add(0,pq.poll().word);
        }

        return res;
    }
}
