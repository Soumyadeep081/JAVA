package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class Q5 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Convert Sorted Array to Binary Search Tree:
        int[]nums={-10,-3,0,5,9};
        Node root=conBst(nums);
        bfs(root);

    }
    public static Node conBst(int[]nums){
       return fun(nums,0,nums.length-1);

    }
    private static Node fun(int[]nums,int start,int end){
        if(start>end) return null;
        int mid=(start+end)/2;
        Node root=new Node(nums[mid]);
        root.left=fun(nums,start,mid-1);
        root.right=fun(nums,mid+1,end);
        return root;
    }
    private static void bfs(Node root){
        if(root==null) return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
            while(!q.isEmpty()){
                Node curr=q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null)q.add(curr.left);
                if (curr.right!=null)q.add(curr.right);

            }
        }

}
