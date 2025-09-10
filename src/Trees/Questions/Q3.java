package Trees.Questions;

import java.util.LinkedList;

public class Q3 {
   static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Flatten Binary Tree to Linked List:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //flatten(root);
        Node curr=root;
        flattenTree(root);

        while(curr!=null){
            System.out.print(curr.data);
            System.out.print(curr.left==null?"null ":curr.left.data+" ");
            curr=curr.right;
        }


    }
    //Approach 1: Not in-place:
    public static void flatten(Node root){
        LinkedList<Node>ll=new LinkedList<>();
        preorder(root,ll);
        for(int i=0;i<ll.size()-1;i++){
            ll.get(i).left=null;
            ll.get(i).right=ll.get(i+1);
        }
        Node curr=root;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            System.out.print(curr.left==null?"null ":curr.left.data+" ");
            curr=curr.right;
        }

    }


    //approach 2: In-Place:
    private static Node flattenTree(Node root){
       if(root==null)return null;
       if(root.left==null&&root.right==null) return root;
       Node lt=flattenTree(root.left);
       Node rt=flattenTree(root.right);
       if(lt!=null){
           lt.right=root.right;
           root.right=root.left;
           root.left=null;
       }
       return rt==null?lt:rt;
    }


    private static void preorder(Node root,LinkedList<Node>ll){
        if(root==null) return;
        ll.add(root);
        preorder(root.left,ll);
        preorder(root.right,ll);
    }
}
