package String;


public class Q7 {
    public static void main(String[] args) {
        //Remove Outermost Parentheses:

        String s="(()())(())";
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(c>0) sb.append(ch);
                c++;
            }
            else{
                c--;
                if(c>0) sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
