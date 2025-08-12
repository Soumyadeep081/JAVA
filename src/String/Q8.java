package String;

public class Q8 {
    public static void main(String[] args) {

        //Reverse words in a given string / Palindrome Check
        String s="the sky is blue";
        StringBuilder sb=new StringBuilder();
        String[]words=s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
