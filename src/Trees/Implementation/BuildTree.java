package Trees.Implementation;

import java.util.*;
//-------------------------------------------------
//Build Tree if input is comma separated Integers: |
//-------------------------------------------------
public class BuildTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node insert(Integer[]nums,int i){
        if(i>=nums.length||nums[i]==null)return null;
        Node root=new Node(nums[i]);
        root.left=insert(nums,2*i+1);
        root.right=insert(nums,2*i+2);
        return root;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String[]arr=str.split(",");
        Integer[]nums=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("null")){
                nums[i]=null;
            }
            else{
                nums[i]=Integer.parseInt(arr[i]);
            }
        }
        Node root=insert(nums,0);
        System.out.println(f(root));
        
    }
    static class pair{
        Node node;
        int index;
        pair(Node node,int index){
            this.node=node;
            this.index=index;
        }
    }
    private static int f(Node root){
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(root,0));
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            int first=0,last=0;
            for(int i=0;i<size;i++){
                pair p=q.poll();
                Node node=p.node;
                int index=p.index;
                if(i==0)first=index;
                if(i==size-1)last=index;
                if(node.left!=null)q.add(new pair(node.left,2*index+1));
                if(node.right!=null)q.add(new pair(node.right,2*index+2));
            }
            max=Math.max(max,last-first+1);
        }
        return max;
    }
    
}
