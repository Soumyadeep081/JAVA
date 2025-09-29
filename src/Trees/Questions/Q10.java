package Trees.Questions;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Path to Given Node:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer>ll=new ArrayList<>();
        f(root,ll,7);
        System.out.println(ll);
    }
    private static boolean f(Node root, List<Integer> ll, int x){
        if(root==null)return false;
        ll.add(root.data);
        if(root.data==x)return true;
        if(f(root.left,ll,x)||f(root.right,ll,x))return true;
        ll.removeLast();
        return false;

    }
}
