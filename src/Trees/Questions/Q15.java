package Trees.Questions;

public class Q15 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Binary Tree Maximum Path Sum:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        max=Integer.MIN_VALUE;
        f(root);
        System.out.println(max);
    }
    static int max;
    private static int f(Node root){
        if(root==null)return 0;
        int left=Math.max(0,f(root.left));
        int right=Math.max(0,f(root.right));
        max=Math.max(max,left+right+root.data);
        return root.data+Math.max(left,right);
    }
}
