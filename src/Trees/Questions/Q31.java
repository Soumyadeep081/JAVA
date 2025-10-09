package Trees.Questions;

import java.util.ArrayList;
import java.util.List;

public class Q31 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Path Sum ||:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(find(root,8));
    }
    public static List<List<Integer>> find(Node root, int x){
        List<List<Integer>>out=new ArrayList<>();
        f(root,new ArrayList<>(),out,x);
        return out;
    }
    private static void f(Node root,List<Integer>ll,List<List<Integer>>out,int x){
        if(root==null)return;
        ll.add(root.data);
        x-=root.data;
        if(root.left==null&&root.right==null){
            if(x==0)out.add(new ArrayList<>(ll));
        }
        f(root.left,ll,out,x);
        f(root.right,ll,out,x);
        ll.removeLast();
    }
}
