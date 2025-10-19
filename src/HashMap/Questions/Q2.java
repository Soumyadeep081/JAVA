package HashMap.Questions;

public class Q2 {
    public static void main(String[] args) {
        int[]a={20,25,10,3,15,27};
        int k=10;
        System.out.println(f(a,k));
    }
    private static boolean f(int[]a,int k){
        if(a.length%2!=0)return false;
        int[]freq=new int[k];
        for(int num:a){
            num=num%k;
            if(num<0)num+=k;
            freq[num]++;
        }
        if(freq[0]%2!=0)return false;
        for(int i=1;i<=k/2;i++){
            if(freq[i]!=freq[k-i])return false;
        }
        return true;
    }
}
