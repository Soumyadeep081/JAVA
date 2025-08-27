package LinkedList.questions;

public class Q13 extends Q1{
    public static int sol(Node head){
        //Maximum Twin Sum of a Linked List:
        Node fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node c=slow,p=null,n;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        int max=0;
        while(p!=null){
            max=Math.max(max,head.data+p.data);
            head=head.next;
            p=p.next;
        }
        return max;
    }
}
