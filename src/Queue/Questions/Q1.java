package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Print Binary of numbers from 1 to n:

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int n=input.nextInt();
        generate(n);
    }
    public static void generate(int n){
        Queue<String>q=new LinkedList<>();
        q.add("1");
        while(n>0){
            String s1=q.remove();
            System.out.println(s1);
            q.add(s1+"0");
            q.add(s1+"1");
            n--;
        }

    }
}
