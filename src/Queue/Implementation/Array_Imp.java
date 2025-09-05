package Queue.Implementation;

import java.util.Scanner;

public class Array_Imp {
     static class queues{
        private int rear=-1,front=-1,max;
        int[]queue;
        public queues(int size){
            this.max=size;
            queue=new int[size];
        }
        public void enqueue(int data){
            if(rear==max-1){
                System.out.println("Overflow");
                return;
            }
            if(front==-1) front=0;
            rear++;
            queue[rear]=data;
        }
        public void dequeue(){
            if(front==-1){
                System.out.println("Empty queue");
                return;
            }
            System.out.println("Popped item: "+queue[front]);
            front++;
            if(front>rear){
                front=-1;
                rear=-1;
            }
        }
        public void display(){
            if(front==-1){
                System.out.println("Empty queue");
                return;
            }
            System.out.println("Queue: ");
            for(int i=front;i<=rear;i++){
                System.out.printf("%d ",queue[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter queue size");
        int size=input.nextInt();
        queues q=new queues(size);
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
