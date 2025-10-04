package Trees.Questions;

public class Q22 {
    static class ListNode {
        int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        //Convert Sorted List to Binary Search Tree:

        ListNode head=new ListNode(-10);
        ListNode curr=head;
        for(int i=1;i<5;i++){
            head.next=new ListNode(i);
            head=head.next;
        }
        Node root=f(curr);

    }
    private static Node f(ListNode head){
        if(head==null)return null;
        if(head.next==null)return new Node(head.val);
        ListNode mid=MID(head);
        Node root=new Node(mid.val);
        root.left=f(head);
        root.right=f(mid.next);
        return root;
    }
    private static ListNode MID(ListNode head){
        ListNode slow=head,fast=head,prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
    }
}
