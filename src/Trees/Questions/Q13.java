package Trees.Questions;

public class Q13 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    // Lowest Common Ancestor of a Binary Search Tree:
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
    }
    private static Node f(Node root,Node p, Node q){
        if(root==null)return root;
        if(p.data<root.data&&q.data<root.data)return f(root.left,p,q);
        if(p.data>root.data&&q.data>root.data)return f(root.right,p,q);
        return root;
    }
}
