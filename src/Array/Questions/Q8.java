package Array.Questions;

public class Q8 {
    public static void main(String[] args) {
        //Concatenation of Array:
        int[]a={1,2,1};
        int[] result=new int[2*a.length];
        for(int i=0;i<a.length;i++){
            result[i]=a[i];
            result[i+a.length]=a[i];
        }
        for(int num:result)
        {
            System.out.println(num);
        }

    }
}
