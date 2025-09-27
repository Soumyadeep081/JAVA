package Trees.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Traversal_Iterative {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(pre(root));

        System.out.println(post(root));

        System.out.println(in(root));

    }
    //PreOrder Traversal:
    private static List<Integer> pre(Node root){
        List<Integer>ll=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            if(curr!=null){
                ll.add(curr.data);
                st.push(curr.right);
                st.push(curr.left);
            }
        }
        return ll;
    }
    //PostOrder Traversal:
    private static List<Integer>post(Node root) {
        List<Integer> ll = new ArrayList<>();
        if (root == null) return ll;
        Stack<Node> st = new Stack<>();
        st.push(root);
        Node prev = null;
        while (!st.isEmpty()) {
            Node curr = st.peek();
            if (curr.left == null && curr.right == null || (prev != null && (prev == curr.left || prev == curr.right))) {
                ll.add(st.pop().data);
                prev = curr;
            } else {
                if (curr.right != null) st.push(curr.right);
                if (curr.left != null) st.push(curr.left);
            }
        }
        return ll;
    }

    //Inorder Traversal:
    private static List<Integer>in(Node root){
        List<Integer>ll=new ArrayList<>();
        if(root==null)return ll;
        Stack<Node>st=new Stack<>();
        Node curr=root;
        while (curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);curr=curr.left;
            }
            curr=st.pop();
            ll.add(curr.data);
            curr=curr.right;
        }
        return ll;

    }
}
