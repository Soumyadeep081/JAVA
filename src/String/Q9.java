package String;

public class Q9 {
    public static void main(String[] args) {

        //Largest odd number in a string
        String s="52";
        boolean found = false;
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2!=0){
                System.out.println(s.substring(0,i+1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("");
        }

    }
}
