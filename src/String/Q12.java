package String;

public class Q12 {
    public static void main(String[] args) {
        //Rotate String:

        String s="abcde",goal="bcdea";

        boolean flag=false;
        StringBuilder sb=new StringBuilder(s);
        int left=0,right=s.length()-1;
        while(left<=right){
            if(sb.substring(left).equals(goal)){
                flag=true;
                break;
            }
            sb.append(s.charAt(left++));
        }
        System.out.println(flag);

    }
}
