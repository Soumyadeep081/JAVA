package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class Q11 {
    static class Node{
        int data;
        Node left,right,next;
        public Node(int data){
            this.data=data;
            this.left=this.right=this.next=null;
        }
    }
    public static void main(String[] args) {
        //Populating Next Right Pointers in Each Node:


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bfs(f(root));

    }
    private static Node f(Node root){
        if(root==null)return null;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i<size-1){
                    curr.next=q.peek();
                }
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return root;
    }
    public static void bfs(Node root){
        if(root==null) return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }

    }
}
