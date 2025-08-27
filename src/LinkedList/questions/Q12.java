package LinkedList.questions;

public class Q12 extends Q1{
    public static Node sol(Node head,int x){
        //Partition List:

        Node dummy1=new Node(0),dummy2=new Node(0);
        Node d1=dummy1,d2=dummy2;
        while(head!=null){
            if(head.data<x){
                dummy1.next=head;
                dummy1=dummy1.next;
            }
            else{
                dummy2.next=head;
                dummy2=dummy2.next;
            }
            head=head.next;
        }
        dummy2.next=null;
        dummy1.next=d2.next;
        return d1.next;
    }
}
