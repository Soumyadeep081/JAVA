package LinkedList.questions;

import java.util.Scanner;

public class Q17 {
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
        //First Node of Loop in Linked List:
        Scanner input=new Scanner(System.in);

        Node head=null;
        while(input.hasNextInt()){
            head=insert(head,input.nextInt());
        }

        Node slow=head,fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                System.out.println(slow.data);
                return;
            }
        }
        System.out.println(-1);
    }
}
