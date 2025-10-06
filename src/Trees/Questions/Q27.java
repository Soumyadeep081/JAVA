package Trees.Questions;

public class Q27 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Balanced Binary tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(isBal(root));

        System.out.println(f2(root)!=-1);
    }
    //Approach 1:O(n^2):
    private static boolean isBal(Node root){
        if(root==null||(root.left==null&&root.right==null))return true;
        int x=f(root.left);
        int y=f(root.right);
        return Math.abs(x-y)<=1&&isBal(root.left)&&isBal(root.right);
    }
    private static int f(Node root){
        if(root==null)return 0;
        int left=f(root.left);
        int right=f(root.right);
        return Math.max(left,right)+1;
    }
    //------------------------------------------------------------------------
    //Approach 2:O(n):
    private static int f2(Node root){
        if(root==null)return 0;
        int left=f2(root.left);
        if(left==-1)return -1;
        int right=f2(root.right);
        if(right==-1)return -1;
        if(Math.abs(left-right)>1)return -1;
        return Math.max(left,right)+1;
    }
}
