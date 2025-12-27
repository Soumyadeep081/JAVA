package Greedy.Q26;

public class sol {
    public static void main(String[] args) {
        String customers="YYNY";
        System.out.println(f(customers));
    }
    public static int f(String s){
        int pen=0,min=0;
        for(char ch:s.toCharArray()){
            if(ch=='Y')pen++;
        }
        int min_pen=pen;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='Y')pen--;
            else pen++;
            if(pen<min_pen){
                min_pen=pen;
                min=i+1;
            }
        }
        return min;
    }
}
