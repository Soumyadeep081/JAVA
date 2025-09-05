package Queue.Implementation;

import java.util.Scanner;

public class LinkedList_Imp {
    static class queues{
        class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        Node head=null,tail=null;
        public void enqueue(int data){
            Node nn=new Node(data);
            if(head==null) head=tail=nn;
            else{
                tail.next=nn;
                tail=nn;
            }

        }
        public void dequeue(){
            if(head==null){
                System.out.println("Empty queue");
                return;
            }
            System.out.println("Popped item: "+head.data);
            head=head.next;
        }
        public void display(){
            if(head==null){
                System.out.println("Empty queue");
                return;
            }
            System.out.println("Queue: ");
            Node temp=head;
            while(temp!=null){
                System.out.printf("%d ",temp.data);
                temp=temp.next;
            }

        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        queues q= new queues();
        int ch,data;
        do{
            System.out.println("\nEnter choice:\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            ch=input.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter data");
                    data=input.nextInt();
                    q.enqueue(data);
                    q.display();
                    break;
                case 2:
                    q.dequeue();
                    q.display();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error");

            }
        }while(ch!=4);
    }
}
