package Trees.Questions;

import java.util.*;

public class Q32 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //All Nodes Distance K in Binary Tree:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int x=5;
        findNode(root,x);
        int k=2;

        System.out.println(distanceK(root,k,target));

    }
    public static List<Integer> distanceK(Node root, int k, Node target){
        Map<Node,Node>parent=new HashMap<>();
        buildParent(root,null,parent);
        Set<Node> vis=new HashSet<>();
        Queue<Node>q=new LinkedList<>();
        q.add(target);
        vis.add(target);
        int dist=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(dist==k)break;
            dist++;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null&&!vis.contains(curr.left)){
                    q.add(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null&&!vis.contains(curr.right)){
                    q.add(curr.right);
                    vis.add(curr.right);
                }
                if(parent.get(curr)!=null&&!vis.contains(parent.get(curr))){
                    q.add(parent.get(curr));
                    vis.add(parent.get(curr));
                }
            }
        }
        List<Integer>ll=new ArrayList<>();
        while(!q.isEmpty()){
            ll.add(q.poll().data);
        }
        return ll;
    }
    private static void buildParent(Node root, Node par, Map<Node,Node> parent){
        if(root==null)return;
        parent.put(root,par);
        buildParent(root.left,root,parent);
        buildParent(root.right,root,parent);
    }

static Node target=null;
    private static boolean findNode(Node root,int x){
        if(root==null)return false;
        if(root.data==x){
            target=root;
            return true;
        }
        boolean lf=findNode(root.left,x);
        boolean rf=findNode(root.right,x);
        return lf||rf;

    }

}
