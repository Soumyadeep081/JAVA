package LinkedList.questions;

public class Q14 extends Q1{
    public Node addTwoNumbers(Node l1, Node l2) {
        //Add Two Numbers:
        
        Node dummy=new Node(0),curr=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int val1=0,val2=0;
            if(l1!=null){
                val1=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                val2=l2.data;
                l2=l2.next;
            }
            int sum=val1+val2+carry;
            carry=sum/10;
            curr.next=new Node(sum%10);

            curr=curr.next;
        }
        return dummy.next;
    }
}
