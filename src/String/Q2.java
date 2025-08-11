package String;

public class Q2 {
    public static void main(String[] args) {
        //Palindrome or not:

        String s = "madam";

        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev)) System.out.println(true);
        else System.out.println(false);
    }
}
