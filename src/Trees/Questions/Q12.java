package Trees.Questions;

import java.util.ArrayList;
import java.util.List;

public class Q12 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Lowest Common Ancestor:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
    //Approach 1:Finding paths separately.(Not optimal)
    private static Node f(Node root,Node p,Node q){
        List<Node> p1=new ArrayList<>();
        List<Node>p2=new ArrayList<>();
        f2(root,p1,p);
        f2(root,p2,q);
        Node curr=null;
        int i=0,j=0;
        while(i<p1.size()&&j<p2.size()){
            if(p1.get(i)!=p2.get(j))break;
            curr=p1.get(i);
            i++;j++;
        }
        return curr;
    }
    private static boolean f2(Node root,List<Node>ll,Node x){
        if(root==null)return false;
        ll.add(root);
        if(root==x)return true;
        if(f2(root.left,ll,x)||f2(root.right,ll,x))return true;
        ll.removeLast();
        return false;
    }
//--------------------------------------------------------------------------------------------

    //Approach 2:Efficient:
    private static Node f3(Node root,Node p,Node q){
        if(root==null)return null;
        if(root==p||root==q)return root;
        Node left=f3(root.left,p,q);
        Node right=f3(root.right,p,q);
        if(left!=null&&right!=null)return root;
        else if(left!=null)return left;
        else return right;
    }
}
