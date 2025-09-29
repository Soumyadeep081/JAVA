package Trees.Questions;

public class Q9 {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Count Good Nodes in Binary Tree:

        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.left = new Node(3);
        root.right.left = new Node(1);
        root.right.right = new Node(5);


        System.out.println(f(root));

    }
    static int c=0;
    public static int f(Node root){
        fun(root,Integer.MIN_VALUE);
        return c;
    }
    private static void fun(Node root, int max){
        if(max<=root.data)c++;
        if(root.left!=null){
            fun(root.left,Math.max(max,root.data));
        }
        if(root.right!=null){
            fun(root.right,Math.max(max,root.data));
        }


    }
}
