package Trees.Questions;


import java.util.LinkedList;
import java.util.Queue;

public class Q4 {
   static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {

        //Construct BST from preorder Traversal:
        int[]preorder={8,5,1,7,10,12};
        Node root=fun(preorder);
        bfs(root);


    }
    private static Node fun(int[]preorder){
       Node root=new Node(preorder[0]);
       for(int i=1;i<preorder.length;i++){
                conBst(root,preorder[i]);
       }
       return root;
    }
    private static Node conBst(Node root,int x){
       if(root==null) return new Node(x);
       if(x<root.data){
           root.left=conBst(root.left,x);
       }
       else if (root.data<x)root.right=conBst(root.right,x);
       return root;
    }
    public static void bfs(Node root){
        if(root==null){

            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();

            System.out.print(curr.data+" ");

            if(curr.left!=null)q.add(curr.left);
          if(curr.right!=null)  q.add(curr.right);
        }
}}
