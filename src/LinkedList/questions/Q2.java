package LinkedList.questions;

public class Q2 extends Q1 {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node curr = new Node(2);
        Node curr2=new Node(3);
        head.next = curr;
        curr.next=curr2;

        //Mid of a LinkedList:
        head=mid(head);
        System.out.println(head.data);




    }
    private static Node mid(Node head){
        if(head==null || head.next==null) return head;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
