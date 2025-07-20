package Array.Questions;

import java.util.HashSet;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
    //Check if the Sentence Is Pangram:
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String sen=input.next();
        HashSet<Character>set=new HashSet<>();
        for(char c:sen.toCharArray()){
            if(c>='a'&&c<='z'){
                set.add(c);
            }
        }
        System.out.println(set.size()==26);

    }
}
