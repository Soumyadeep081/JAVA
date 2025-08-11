package String;

public class Q4 {
    public static void main(String[] args) {
        String s="abcd";

        StringBuilder sb=new StringBuilder(s);
        //Replace Ascii:

        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(i%2==0){
                ch=(char)(ch+1);
                sb.setCharAt(i,ch);
            }
            else{
                ch=(char)(ch-1);
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }
}
