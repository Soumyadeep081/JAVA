package String;

public class Q1 {
    public static void main(String[] args) {
        //Reverse of a String:
        String s="hello";

        //Using a loop:
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);


        //StringBuilder:
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}
