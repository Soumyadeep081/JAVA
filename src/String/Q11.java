package String;


import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        //Isomorphic Strings:

        String s="add",t="egg";
        boolean flag=true;
        HashMap<Character,Character>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))) {
                if (hm.get(s.charAt(i)) != t.charAt(i)) {
                    flag = false;
                    break;
                }} else if (hm.containsValue(t.charAt(i))) {
                    flag = false;
                    break;
                }

            hm.put(s.charAt(i),t.charAt(i));
        }
        System.out.println(flag);
    }
}
