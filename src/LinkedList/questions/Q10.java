package LinkedList.questions;

public class Q10 extends Q1 {
    public static Node removeNode(Node head,int n){
        //Remove Nth Node From End of List

        if(head==null || head.next==null) return null;
        int k=0;
        Node ptr=head,temp=head,prev=head;
        while(ptr!=null){
            k++;
            ptr=ptr.next;
        }
        if(k==n){
            return head.next;
        }
        int c=k-n;

        while(c!=0){
            prev=temp;
            temp=temp.next;
            c--;
        }
        prev.next=temp.next;
        temp.next=null;
        return head;
    }
}
