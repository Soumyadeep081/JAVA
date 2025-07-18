package Array;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Initialise an array:
        System.out.println("enter array size ");
        int n=input.nextInt();
         int[] a=new int[n];

         //Takin input from user:
         System.out.println("enter array elements");
          for(int i=0;i<n;i++){
              a[i] = input.nextInt();
          }

          //Printing Array Elements:
          System.out.println("Array is:");
          for(int i=0;i<n;i++){
              System.out.printf("%d\t",a[i]);
          }



         // Important Functions associated to Array:
  int[]b={1,2,3,4,5};
  System.out.println(b.length);//prints length
  int[] c = (b.clone());//copies the array
  for(int i=0;i<5;i++){
      System.out.print(c[i]);
  }
  System.out.println("\n"+Arrays.toString(b));//Returns a string representation of the contents of the specified array
        System.out.println(Arrays.equals(b, a)); //Returns true if the two specified arrays of ints are equal to one another


 //Arrays are mutable:
  int[] arr={1,2,3,4,5};
  arr[0]=10;
  arr[1]=20;
  for(int i=0;i<5;i++){
      System.out.println(arr[i]);
  }


 //Enhanced For loop:
 //for reading purpose only. In forward direction only.
   for(int val:a){
      System.out.print(val);
   }


    }
}
