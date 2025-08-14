package String;

public class Q15 {
    public static void main(String[] args) {
        //Maximum Nesting Depth of the Parentheses:

       String s = "(1+(2*3)+((8)/4))+1";
       int c=0,max=0;
       for(char ch:s.toCharArray()){
           if(ch=='(') c++;
           else if(ch==')') c--;
           max=Math.max(max,c);
       }
        System.out.println(max);
    }
}
