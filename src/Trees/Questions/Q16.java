package Trees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q16 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Binary Tree Zigzag Level Order Traversal:


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>>out=new ArrayList<>();
        f(root,out);
        System.out.println(out);
    }
    private static void f(Node root, List<List<Integer>>out){
        if(root==null)return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer>ll=new LinkedList<>();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(flag)ll.addLast(curr.data);
                else ll.addFirst(curr.data);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            out.add(new ArrayList<>(ll));
            flag=!flag;
        }
    }
}
