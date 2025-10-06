package Trees.Questions;

import java.util.*;

public class Q24 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Array To Binary Tree and print the cue of post order traversal of the binary tree elements:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        Node root=f(a);
        List<Integer>ll=new ArrayList<>();
        post(root,ll);
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

    }
    private static Node f(int[]a){
        if(a.length==0)return null;
        Queue<Node>q=new LinkedList<>();
        Node root=new Node(a[0]);
        q.add(root);
        int i=1;
        while(!q.isEmpty()&&i<a.length){
            Node curr=q.poll();
            if(i<a.length){
                curr.left=new Node(a[i]);
                q.add(curr.left);
            }
            i++;
            if(i<a.length){
                curr.right=new Node(a[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    private static void post(Node root, List<Integer>ll){
        if(root==null)return;
        post(root.left,ll);
        post(root.right,ll);
        ll.add((int) Math.pow(root.data,3));
    }
}
