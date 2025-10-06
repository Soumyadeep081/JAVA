package Trees.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q25 {
    static class Node{
        char data;
        Node left,right;
        public Node(char data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        char[]a=new char[n];
        for(int i=0;i<n;i++){
            a[i]=input.next().charAt(0);
        }
        char v=input.next().charAt(0);
        Arrays.sort(a);
        Node root=conBst(a,0,a.length-1);
        root=del(root,v);
        List<Character>ll=new ArrayList<>();
        inorder(root,ll);
        for (Character integer : ll) {
            System.out.println(integer);
        }

    }
    private static Node conBst(char[]a,int start,int end){
        if(start>end)return null;
        int mid=(start+end)/2;
        Node root=new Node(a[mid]);
        root.left=conBst(a,start,mid-1);
        root.right=conBst(a,mid+1,end);
        return root;
    }
    private static Node del(Node root,char x){
        if(root==null) return null;
        if(x>root.data)root.right=del(root.right,x);
        else if(x<root.data)root.left=del(root.left,x);
        else{
            if(root.left==null&&root.right==null)return null;

            if(root.left==null)return root.right;
            else if(root.right==null)return root.left;

            Node is=f2(root.right);
            root.data=is.data;
            root.right=del(root.right,x);
        }
        return root;
    }
    private static Node f2(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    private static void inorder(Node root, List<Character> ll){
        if(root==null)return;
        inorder(root.left,ll);
        ll.add(root.data);
        inorder(root.right,ll);
    }
}
