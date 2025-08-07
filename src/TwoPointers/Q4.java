package TwoPointers;

public class Q4 {
    public static void main(String[] args) {
        // Valid Palindrome:
        String s="A man, a plan, a canal: Panama";

        //Approach 1: Using stringBuilders:
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&& s.charAt(i)<='z') || (s.charAt(i)>='A' &&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String s2=sb.toString();
        String s3=sb.reverse().toString();
        System.out.println(s2.equals(s3));


        //Approach 2: Two Pointers:
        int left=0,right=s.length()-1;
        while(left<right){
            char ch1=s.charAt(left);
            char ch2=s.charAt(right);
            if(!Character.isLetterOrDigit(ch1)) left++;
            else if(!Character.isLetterOrDigit(ch2)) right--;
            else if(!(Character.toLowerCase(ch1)==Character.toLowerCase(ch2))) System.out.println("false");
            else{
                left++;right--;
            }
        }
        System.out.println("true");
    }
}
