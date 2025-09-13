package Recursion;

public class Q3 {
    public static void main(String[] args) {
        //Check String is palindrome or not:
        String s="madam";
        String r="";
        r=fun(s,0);
        System.out.println(s.equals(r));

        System.out.println(check(s,0,s.length()-1));
    }

    //Approach1:
    private static String fun(String s,int i){
        if(i==s.length())return"";
        return fun(s,i+1)+s.charAt(i);

    }

    //Approach2:
    private static boolean check(String s,int left,int right){
        if(left>=right/2) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
       return check(s,left+1,right-1);

    }

}
