package Trees.Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal_Recursive {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

        //1.DFS(Depth First Search):
        //-> Uses Stack DS.
        //->(Preorder, Inorder, Postorder)

        //2.BFS(Breadth First Search):
        //->Uses Queue DS.
        //-> Level Order Traversal.



        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Preorder Traversal:");
        preorder(root);

        System.out.println("\nInorder Traversal:");
        inorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);

        System.out.println("\nBFS (Level Order Traversal):");
        bfs(root);
    }

    //1.Preorder:- (Root->Left->Right)
    public static void preorder(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //2.Inorder:-(Left->Root->Right)
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //3.Postorder:-(left->right->root)
    public static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //4.BFS:-
    public static void bfs(Node root){
        if(root==null) return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }

    }
}
