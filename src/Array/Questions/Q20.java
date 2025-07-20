package Array.Questions;

public class Q20 {
    public static void main(String[] args) {
        //Determine Whether Matrix Can Be Obtained By Rotation:
        int[][]mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][]target={{1,1,1},{0,1,0},{0,0,0}};
        for(int i=0;i<4;i++){
            if(isEqual(mat,target)) {
                System.out.println(true);
                return;
            }
            mat=rotate_array(mat);
        }
        System.out.println(false);
    }
    static int[][] rotate_array(int[][]a){
        int [][]b=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=0;j--){
                b[j][a.length-1-i]=a[i][j];
            }
        }
return b;
    }
    static boolean isEqual(int[][]a,int[][]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]!=b[i][j]) return false;
            }
        }
        return true;
    }
}
