package LinkedList.questions;

public class Q7 extends Q1 {
    public static boolean isPd(Node head){
        //Palindromic LinkedList:

        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null,curr=slow,n;
        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }

        while(prev!=null){
            if(prev.data!= head.data) return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}
