package Functions.Questions;
import java.util.Scanner;
import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Enter array size ");
        int n=input.nextInt();
        System.out.println("Enter an array ");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        if(check(a)){
            System.out.println("Pythagorean Triplet exist ");

        }
        else System.out.println("Pythagorean triplet do not exist");
    }
    static boolean check(int[]a){
        if(a.length<3) return false;
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        for(int i=a.length-1;i>1;i--){
            int l=0,r=i-1;
            while(l<r){
                if(a[l]+a[r]==a[i]) return true;
                else if(a[l]+a[r]<a[i]) l++;
                else r--;
            }

        }
        return false;
    }
}
