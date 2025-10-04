package Trees.Questions;

import java.util.ArrayList;
import java.util.List;

public class Q21 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Kth smallest element in a BST:

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);

        List<Integer>ll=new ArrayList<>();
        f(root,ll);
        int k=3;
        System.out.println(ll.get(k-1));

        f2(root,k);
        System.out.println(res);
    }
    //Approach 1: Using a list:
    private static void f(Node root, List<Integer> ll){
        if(root==null)return;
        f(root.left,ll);
        ll.add(root.data);
        f(root.right,ll);
    }

    //Approach 2: Efficient
    private static int c=0;
    private static int res=-1;
    private static void f2(Node root,int k){
        if(root==null||res!=-1)return;
        f2(root.left,k);
        c+=1;
        if(c==k){
            res=root.data;
            return;
        }

        f2(root.right,k);
    }
}
