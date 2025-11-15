package Greedy.Q15;

public class sol2 {
    public static void main(String[] args) {
        //Optimal: greedy;

        String s="(**(*()**()**((**(*)";

        System.out.println(f(s));
    }
    public static boolean f(String s){
        int min=0;
        int max=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                min++;
                max++;
            }
            else if(ch==')'){
                min--;
                max--;
            }
            else{
                min--;
                max++;
            }
            if(min<0)min=0;
            if(max<0)return false;
        }
        return min==0;
    }
}
