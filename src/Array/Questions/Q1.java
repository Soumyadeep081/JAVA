package Array.Questions;

import java.util.*;
public class Q1 {
    public static void main(String[] args) {

        //Question 1: Take array input using function and print using function as well-
        int[]a=inputArray();
        System.out.println("Array is: ");
        outArray(a);

    }
    static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size ");
        int n=input.nextInt();
        System.out.println("Enter array elements ");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        return a;
    }
    static void outArray(int[]a){
        for(int num:a){
            System.out.println(num);
        }
    }
}
