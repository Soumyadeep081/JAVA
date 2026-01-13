package LinkedList.questions;

import java.util.*;
public class Q15 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node insert(Node head,int data){
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
        //Sort List
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            head=insert(head,input.nextInt());
        }

        head=mergeSort(head);

        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }


    }
    private static Node findMid(Node head){
        if(head==null||head.next==null)return head;
        Node slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static Node mergeSort(Node head){
        if(head==null||head.next==null)return head;
        Node mid=findMid(head);
        Node right=mid.next;
        mid.next=null;
        Node left=mergeSort(head);
        right=mergeSort(right);
        return merge(left,right);
    }
    private static Node merge(Node left,Node right){
        if(left==null)return right;
        if(right==null)return left;

        Node dummy=new Node(0);
        Node d=dummy;
        while(left!=null&&right!=null){
            if(left.data<right.data){
                dummy.next=left;
                left=left.next;
            }
            else{
                dummy.next=right;
                right=right.next;
            }
            dummy=dummy.next;
        }
        while(left!=null){
            dummy.next=left;
            left=left.next;
            dummy=dummy.next;
        }
        while(right!=null){
            dummy.next=right;
            right=right.next;
            dummy=dummy.next;
        }
        return d.next;
    }
}
