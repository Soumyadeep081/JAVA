package Recursion;
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        // Letter Combinations of a Phone Number:
        String dig="23";
        List<String>out=new ArrayList<>();
        f(dig,0,"",out);
        System.out.println(out);
    }
    private static void f(String s,int i,String str,List<String>out){
        if(s.isEmpty()){
            return;
        }
        String[]a={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(i==s.length()){
            out.add(str);
            return;
        }
        int digit=s.charAt(i)-'0';
        for(int k=0;k<a[digit].length();k++){
            f(s,i+1,str+a[digit].charAt(k),out);
        }
    }
}
