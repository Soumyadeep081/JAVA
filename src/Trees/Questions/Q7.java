package Trees.Questions;

public class Q7 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Search In BST:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node curr=f(root,3);
        if(curr!=null){
            System.out.println("Found "+curr.data);
        }
        else System.out.println("Not Found");

    }
    private static Node f(Node root,int x){
        while(root!=null){
            if (root.data==x) return root;
            else if(root.data<x) root=root.right;
            else root=root.left;

        }
        return null;
    }


}
