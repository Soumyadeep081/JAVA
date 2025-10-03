package Trees.Questions;

public class Q20 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }

}
    public static void main(String[] args) {
        //Delete Node in a BST:

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);

        root=deleteNode(root,3);
    }
        public static Node deleteNode(Node root, int key) {
            if (root == null) return null;
            if (root.data < key) {
                root.right = deleteNode(root.right, key);
            } else if (root.data > key) {
                root.left = deleteNode(root.left, key);
            } else {
                // Case 1 (No child) :
                if (root.left == null && root.right == null) return null;
                // Case 2 (Single child) :
                if (root.left == null) return root.right;
                else if (root.right == null) return root.left;
                // Case 3 (Two child) :
                Node IS = inOrderSuccessor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
            return root;
        }
        public static Node inOrderSuccessor(Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;

        }
}
