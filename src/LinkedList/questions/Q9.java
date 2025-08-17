package LinkedList.questions;

public class Q9 extends Q1 {
    public static  Node OE_list(Node head){
        //Odd Even Linked List:

        Node odd=head,even=head.next,evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;


    }
}
