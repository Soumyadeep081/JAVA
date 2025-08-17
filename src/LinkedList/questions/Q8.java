package LinkedList.questions;

public class Q8 extends Q1{
    public static Node delMid(Node head){
        //Delete Middle Node in a LinkedList:

        if(head==null ||head.next==null) return null;
        Node slow=head,fast=head,prev=slow;

        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        slow.next=null;
        return head;
    }
}
