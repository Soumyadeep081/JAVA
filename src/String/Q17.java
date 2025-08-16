package String;

public class Q17 {
    public static void main(String[] args) {
        //Sum of beauty of all Substrings:

        String s="abacca";

        int sum=0;
        for(int i=0;i<s.length();i++){
            int[]freq=new int[26];
            for(int j=i;j<s.length();j++){
                int index=s.charAt(j)-'a';
                freq[index]++;
                int min=Integer.MAX_VALUE;
                int max=0;
                for(int f: freq){
                    if(f>0){
                        max=Math.max(max,f);
                        min=Math.min(min,f);
                    }

                }
                sum+=(max-min);
            }
        }
        System.out.println(sum);
    }
}
