package Trees.Questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q30 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Construct Binary Tree from Inorder and Postorder Traversal:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]inorder=new int[n];
        int[]postorder=new int[n];
        for(int i=0;i<n;i++){
            inorder[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            postorder[i]=input.nextInt();
        }
        Node root=conBst(inorder,postorder);
        bfs(root);
    }
    static int idx;
    public static Node conBst(int[]inorder,int[]postorder){
        idx=postorder.length-1;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return f(postorder,0,inorder.length-1,hm);
    }
    private static Node f(int[]postorder,int start,int end,HashMap<Integer,Integer>hm){
        if(start>end)return null;
        Node root=new Node(postorder[idx--]);
        int inorderIdx=hm.get(root.data);
        root.right=f(postorder,inorderIdx+1,end,hm);
        root.left=f(postorder,start,inorderIdx-1,hm);
        return root;
    }


    private static void bfs(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.println(curr.data);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
}
