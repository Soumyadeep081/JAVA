package Trees.Questions;

public class Q19 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Insert a node in BST:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root=f(root,9);
    }
    private static Node f(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data)root.left=f(root.left,val);
        else root.right=f(root.right,val);
        return root;
    }

    
}
