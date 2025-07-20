package Array.Questions;

public class Q15 {
    public static void main(String[] args) {
        //Flipping an Image;

        int[][]image={{1,1,0},{1,0,1},{0,0,0}};
        int[][]res=flip(reverse_array(image));

                for(int i=0;i< image.length;i++){
                    for(int j =0;j<image[0].length;j++){
                        System.out.print(res[i][j]);
                    }
                    System.out.println();
                }
    }
    static int[][] reverse_array(int[][]a){
        int j=0;
        int[][]b=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            j=0;
            for(int k=a[0].length-1;k>=0;k--){
                b[i][j++]=a[i][k];
            }

        }
        return b;
    }
    static int[][] flip(int[][]a){ //Can also use ^ symbol
        int[][]fr=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0) fr[i][j]=1;
                else fr[i][j]=0;
            }
        }
        return fr;
    }
}
