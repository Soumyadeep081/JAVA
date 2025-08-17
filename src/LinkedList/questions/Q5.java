package LinkedList.questions;

public class Q5 extends Q1 {
    public static Node reorder(Node head){
        //Reorder LinkedList:

        //Step 1: Find Mid of LL:
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //Step 2: Break the list from mid and reverse the second half:
        Node prev=null,curr=slow.next,n;
        slow.next=null;
        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        Node ptr=head;
        //Step3: Merge the two list:
        while(head!=null && prev!=null){
            Node tmp1=head.next;
            Node tmp2=prev.next;
            head.next=prev;
            if(tmp1==null) break;
            prev.next=tmp1;
            head=tmp1;
            prev=tmp2;
        }
        return ptr;
    }

}
