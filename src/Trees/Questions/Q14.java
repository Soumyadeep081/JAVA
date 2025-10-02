package Trees.Questions;

public class Q14 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Find distance between two nodes of a Binary Tree:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node lca=LCA(root,5,7);
        int s1=f(lca,5,0);
        int s2=f(lca,7,0);
        System.out.println(s1+s2);

    }
    private static Node LCA(Node root,int a,int b){
        if(root==null)return null;
        if(root.data==a||root.data==b)return root;
        Node left=LCA(root.left,a,b);
        Node right=LCA(root.right,a,b);
        if(left!=null&&right!=null)return root;
        else if(left!=null)return left;
        else return right;
    }
    private static int f(Node root,int x,int c){
        if(root==null)return -1;
        if(root.data==x)return c;
        int left=f(root.left,x,c+1);
        if(left!=-1)return left;
        return f(root.right,x,c+1);
    }
}
