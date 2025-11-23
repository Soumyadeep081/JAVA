package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q20 {
    public static void main(String[] args) {
        //Generate Binary Strings Without Consecutive 1s:

        List<String>ll=new ArrayList<>();
        System.out.println(ll=generateBinaryStrings(3));
    }
            public static List<String> generateBinaryStrings(int n) {

                List<String>ll=new ArrayList<>();
                f(n,"",ll);
                return ll;
            }
            private static void f(int n,String s,List<String>ll){
                if(s.length()==n){

                        ll.add(s);

                    return;
                }
                f(n,s+"0",ll);
                if(s.isEmpty()||s.charAt(s.length()-1)!='1') {
                    f(n, s + "1", ll);
                }
            }



}
