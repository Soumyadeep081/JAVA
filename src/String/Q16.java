package String;

import java.util.Map;

public class Q16 {
    public static void main(String[] args) {
        String s="MCMXCIV";
        Map<Character,Integer>mp= Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int sum=0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int curr=mp.get(s.charAt(i));
            if(curr>=prev) sum=sum+curr;
            else sum-=curr;
            prev=curr;
        }
        System.out.println(sum);
    }
}
