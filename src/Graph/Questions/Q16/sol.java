package Graph.Questions.Q16;

import java.util.*;

public class sol {
    public static void main(String[] args) {

        String start="hit";
        String end="cog";
        List<String>wordList= new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));

        System.out.println(f(start,end,wordList));
    }
    public static int f(String start,String end,List<String>wordList){
        Set<String>hs=new HashSet<>(wordList);
        if(!hs.contains(end))return 0;
        Queue<String>q=new LinkedList<>();
        q.add(start);

        Set<String>visited=new HashSet<>();
        visited.add(start);
        int changes=1;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String word=q.poll();
                if(word.equals(end))return changes;
                for(int j=0;j<word.length();j++){
                    char[]arr=word.toCharArray();
                    for(char k='a';k<='z';k++){

                        arr[j]=k;
                        String str=new String(arr);
                        if(hs.contains(str)&&!visited.contains(str)){
                            q.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            ++changes;
        }
        return 0;
    }
}
