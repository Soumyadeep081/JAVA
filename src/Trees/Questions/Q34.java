package Trees.Questions;

import Trees.Implementation.Traversal_Recursive;

public class Q34 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Result{
        Node node;
        int depth;
        Result(Node node,int depth){
            this.node=node;
            this.depth=depth;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        preorder(subtreeWithAllDeepest(root));

    }
    public static void preorder(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node subtreeWithAllDeepest(Node root){
            return dfs(root).node;
        }
        private static Result dfs(Node root){
            if(root==null)return new Result(null,0);

            Result left=dfs(root.left);
            Result right=dfs(root.right);
            if (left.depth>right.depth){
                return new Result(left.node,left.depth+1);
            }
            else if(right.depth>left.depth){
                return new Result(right.node,right.depth+1);
            }
            else return new Result(root,left.depth+1);
        }


}
