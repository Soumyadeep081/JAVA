package LinkedList.questions;

public class Q11 extends Q1{
    public static  Node reverseKGroup(Node head,int k){
        //Reverse Nodes in K group:

        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c>=k){
            int i=0;
            Node p=null,curr=head,n=null;
            while(i<k&&curr!=null){
                n=curr.next;
                curr.next=p;
                p=curr;
                curr=n;
                i++;
            }
            if(n!=null){
                head.next=reverseKGroup(n,k);
            }
            return p;
        }
        return head;
    }
}
