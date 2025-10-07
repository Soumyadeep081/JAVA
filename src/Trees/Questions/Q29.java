package Trees.Questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q29 {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Construct Binary Tree from preorder and Inorder traversal:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]preorder=new int[n];
        int[]inorder=new int[n];
        for(int i=0;i<n;i++){
            preorder[i]=input.nextInt();

        }
        for(int i=0;i<n;i++){
            inorder[i]=input.nextInt();
        }
        Node root=conBst(preorder,inorder);
        bfs(root);
    }
    static int idx;
    public static Node conBst(int[]preorder,int[]inorder){
        idx=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return f(preorder,0,inorder.length-1,hm);
    }
    private static Node f(int[]preorder,int start,int end,HashMap<Integer,Integer>hm){
        if(start>end)return null;
        Node root=new Node(preorder[idx++]);
        int inorderIdx=hm.get(root.data);
        root.left=f(preorder,start,inorderIdx-1,hm);
        root.right=f(preorder,inorderIdx+1,end,hm);
        return root;
    }


    private static void bfs(Node root){
        if(root==null)return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.println(curr.data);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
}
