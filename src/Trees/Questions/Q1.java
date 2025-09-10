package Trees.Questions;




public class Q1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        //Find an element in a tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(find(root,3));

    }
    public static boolean find(Node root,int x){
        if(root==null) return false;
        if(root.data==x) return true;
        boolean lf=find(root.left,x);
        boolean rf=find(root.right,x);

        return lf||rf;
    }
}
