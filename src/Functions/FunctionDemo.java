package Functions;

 import java.util.Scanner;
 import java.lang.Math;

public class FunctionDemo {


    public static void main(String[] args) {
        //Type 1:
        System.out.println("enter two numbers");
        add();

        //Type 2:
        System.out.println("enter two numbers");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt();
        sum(x, y);

        //Type 3:
        System.out.println("enter two numbers");
        int a = input.nextInt(), b = input.nextInt(), z;
        z = plus(a, b);
        System.out.println("answer=" + z);


        //Example:
        int q;
        for (int i = 1; i <= 10; i++) {
            q = square(i);
            System.out.println(q);
        }
    }

    //TYPE 1:
    public static void add() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c;
        c = a + b;
        System.out.println(c);

    }


    //TYPE 2:
    public static void sum(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);

    }


    //TYPE 3:-
    public static int plus(int a, int b) {
        int c;
        c = a + b;
        return c;
    }


    //EXAMPLE:

    public static int square(int a) {
        int res = a * a;
        return res;
    }



}
