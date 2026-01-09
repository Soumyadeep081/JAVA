package Trees.Questions;

import java.util.*;

public class Q33 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //1161. Maximum Level Sum of a Binary Tree:
        Node root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(0);
        root.left.left = new Node(7);
        root.left.right = new Node(-8);

        System.out.println(f(root));

    }
    public static int f(Node root){
        int total=Integer.MIN_VALUE;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int i=0;
        int lvl=0;
        while(!q.isEmpty()){
            int size=q.size();
            i++;
            int sum=0;
            while(size-->0){
                Node curr=q.poll();
                sum+=curr.data;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            if(sum>total){
                total=sum;
                lvl=i;
            }

        }
        return lvl;
    }
}
