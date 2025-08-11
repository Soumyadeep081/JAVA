package String;

public class Q5 {
    public static void main(String[] args) {

            //All substring of a string:
            String s="abc";
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    System.out.println((s.substring(i,j)));
                }
            }

        }
    }

