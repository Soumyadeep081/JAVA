package String;
 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Collections;
 import java.util.List;
public class Intro {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        String a="Hii";
           System.out.println(a);
           String b="hello";
           System.out.println(b);

           //length calculate:
             System.out.println(b.length());


           //Concatenation or joining to strings.
             System.out.println(a.concat(b));

             String c="hello";
           //Comparison between two strings.
             System.out.println(a.equals(b));
             System.out.println(b.equals(c));
             boolean res=(b==c);
             System.out.println(res);


        //Escape characters:
         String str1="this is \"not\" good. ";
         System.out.println(str1);//Output: this is "not" good.


        //Strings are immutable:
          String s1="hello ";
          s1=s1.concat("world");
          System.out.println(s1);
        //Output=hello world
        //but this doesnot mean s1 got mutated rather a new string is created in memory and s1 is just pointing to new string.


        //Accessing elements in a string.
         String s2="JAVA IS GOOD";
         char ch=s2.charAt(0);
         char new_ch=s2.charAt(1);
         System.out.println(ch+" "+new_ch);
         System.out.println(s2.charAt(2));
         System.out.println(s2.charAt(s2.length()-1));


        //Substring:
         System.out.println(s1.substring(0,4));
         System.out.println(s1.substring(0));

         //last index of a repeating element:
         String s3="hiiii";
         System.out.println(s3.lastIndexOf('i'));


         //startswith:
         System.out.println(s1.startsWith("h"));


         //endswith:
         System.out.println(s1.endsWith("i"));

    }
}
