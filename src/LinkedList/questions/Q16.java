package LinkedList.questions;

import java.util.Scanner;

public class Q16 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node insert(Node head, int data){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=temp;
        return head;

    }
        public static void main(String[] args) {
            //24. Swap Nodes in Pairs
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            Node head=null;
            for(int i=0;i<n;i++){
                head=insert(head,input.nextInt());
            }

            head=swapPairs(head);
            Node ptr=head;
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }

        }
    public static Node swapPairs(Node head) {
        if(head==null||head.next==null)return head;
        Node dummy=new Node(0);
        Node d=dummy;
        Node ptr=head;
        while(ptr!=null&&ptr.next!=null){
            Node first=ptr;
            Node second=ptr.next;
            first.next=second.next;
            second.next=first;
            dummy.next=second;
            dummy=first;
            ptr=first.next;
        }
        dummy.next=ptr;
        return d.next;
    }


}
