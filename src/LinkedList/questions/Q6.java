package LinkedList.questions;

public class Q6 extends Q1 {
    public static boolean checkCycle(Node head){
        //Check Cycle in a linkedlist:

        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
