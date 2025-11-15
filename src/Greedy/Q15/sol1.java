package Greedy.Q15;

public class sol1 {
    public static void main(String[] args) {
        //Brute force: Generating all possible pairs and checking whether one of them is true or not

        String s="(**(*()**()**((**(*)";

        System.out.println(f(s,0,0));
    }
    public static boolean f(String s,int ind,int c){
        if(c<0)return false;
        if(ind==s.length())return c==0;

        if(s.charAt(ind)=='(')return f(s,ind+1,c+1);
        if(s.charAt(ind)==')')return f(s,ind+1,c-1);

        return f(s,ind+1,c+1)||f(s,ind+1,c-1)||f(s,ind+1,c);
    }
}
