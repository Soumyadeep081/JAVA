package String;

public class Q3 {
    public static void main(String[] args) {
        //Recursive Digit Sum:

        String s="148";
        int k=3;
        System.out.println(isSuperdigit(s,k));
    }
    static  int isSuperdigit(String s,int k){
        long sum=0;
        for(char c:s.toCharArray()){
            sum=sum+(c-'0');
        }
        sum=sum*k;


        return(find(sum));
    }
    private static int find(long num){
        if(num<=9) return (int)num;
        long sum=0;
        while(num>0){
            long u=num%10;
            sum=sum+u;
            num=num/10;
        }
        return find(sum);
    }
}
