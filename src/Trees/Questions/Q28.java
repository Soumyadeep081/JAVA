package Trees.Questions;

import java.util.ArrayList;
import java.util.List;

public class Q28 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Sum Root to Leaf Numbers:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sumOfPath(root));
    }
    private static int sumOfPath(Node root){
        List<List<Integer>>out=new ArrayList<>();
        f(root,new ArrayList<>(),out);
        int sum=0;
        for(List<Integer>ll:out){
            int num=0;
            for(Integer integer:ll) {
                num=num*10+integer;
            }
            sum+=num;
        }
        return sum;
    }
    private static void f(Node root, List<Integer>ll,List<List<Integer>>out){
        if(root==null)return;
        ll.add(root.data);
        if(root.left==null&&root.right==null)out.add(new ArrayList<>(ll));
        f(root.left,ll,out);
        f(root.right,ll,out);

        ll.removeLast();//remove the last node from the path before returning.
    }
}
