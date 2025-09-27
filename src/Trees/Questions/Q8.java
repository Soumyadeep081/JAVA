package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class Q8 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Trim a BST:

        Node root = new Node(3);
        root.left = new Node(0);
        root.right = new Node(4);
        root.left.left = new Node(-1);
        root.left.right = new Node(2);
        root.left.right.left=new Node(1);
        root.right.right = new Node(5);

        root=f(root,1,4);


        display(root);
    }

    private static Node f(Node root,int low,int high){
        if(root==null) return null;
        if(root.data<low){
            return f(root.right,low,high);
        }
        else if(root.data>high){
            return f(root.left,low,high);
        }
        root.left=f(root.left,low,high);
        root.right=f(root.right,low,high);
        return root;
    }

    public static void display(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }
}
