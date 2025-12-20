package String;

public class Q19 {
    public static void main(String[] args) {
        //944. Delete Columns to Make Sorted:

        String[]strs={"cba","daf","ghi"};

        System.out.println(f(strs));
    }
    public static int f(String[]strs){
        int c=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)) {
                    c++;
                    break;
                }
            }

        }
        return c;
    }
}
