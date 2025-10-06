package Trees.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q26 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Unique BST ||:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        List<Node>ll=new ArrayList<>();
        ll=f(n);
        for(Node root:ll){
            preorder(root);
            System.out.println();
        }
    }
    public static List<Node> f(int n){
        return  f2(1,n);
    }
    private static List<Node>f2(int start,int end){
        List<Node>ll=new ArrayList<>();
        if(start>end){
            ll.add(null);
            return ll;
        }
        for(int i=start;i<=end;i++){
            List<Node>leftTree=f2(start,i-1);
            List<Node>rightTree=f2(i+1,end);

            for(Node left:leftTree){
                for(Node right:rightTree){
                    Node root=new Node(i);
                    root.left=left;
                    root.right=right;
                    ll.add(root);
                }

            }
        }
        return ll;
    }

    private static void preorder(Node root){
        if(root==null)return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }
}
