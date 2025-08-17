package LinkedList.questions;

public class Q3 extends Q1 {
    public static Node mergeSortedList(Node l1,Node l2){
        //Merge Two Sorted List:

        Node prev=new Node(0);
        Node prevHead=prev;
        while(l1!=null&l2!=null){
            if(l1.data<l2.data){
                prev.next=l1;
                l1=l1.next;
            }
            else{
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        while(l1!=null){
            prev.next=l1;
            l1=l1.next;
            prev=prev.next;
        }
        while(l2!=null){
            prev.next=l2;
            l2=l2.next;
            prev=prev.next;
        }
        return prevHead.next;
    }
}
