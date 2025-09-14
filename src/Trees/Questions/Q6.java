package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class Q6 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static int pre=0;
    public static void main(String[] args) {
        //BST to GST:
        Node root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(6);
        root.left.left = new Node(0);
        root.left.right = new Node(2);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        root.left.right.right = new Node(3);
        root.right.right.right = new Node(8);

        root=fun(root);
        bfs(root);


    }
    //reverse Inorder;
    public static Node fun(Node root){
        if(root.right!=null) fun(root.right);
        pre=root.data=pre+root.data;
        if(root.left!=null) fun(root.left);
        return root;
    }
    private static void bfs(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)q.add(curr.left);
            if (curr.right!=null)q.add(curr.right);

        }
    }
}
