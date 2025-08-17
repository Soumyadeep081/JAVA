package LinkedList.questions;



public class Q1 {
   public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        //Reverse a linkedList;
        Node head=new Node(1);
        Node curr=new Node(2);
        head.next=curr;

        head=reverseLL(head);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }



    }
    private static Node reverseLL(Node head){
        if(head==null || head.next==null) return head;
        Node prev=null,curr=head,n;
        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }

}
