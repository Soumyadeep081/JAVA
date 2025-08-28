package Stack.Implementations;

import java.util.Scanner;

class stack{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head;
    public void push(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
    }
    public void pop(){
        if(head==null){
            System.out.println("Empty stack");
            return;
        }
        System.out.println("Popped item: "+head.data);
        head=head.next;
    }
    public void display(){
        if(head==null){
            System.out.println("Empty stack");
            return;
        }
        System.out.println("Stack:");
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class LL_Imp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int data,ch;
        stack st=new stack();
        do{
            System.out.println("Choose option: \n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
            ch=input.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter data");
                    data=input.nextInt();
                    st.push(data);
                    st.display();
                    break;

                case 2:
                    st.pop();
                    st.display();
                    break;

                case 3:
                    st.display();
                    break;

                case 4:
                    System.out.println("exiting...");
                    break;

                default:
                    System.out.println("Error");
                    break;

            }
        }while(ch!=4);



    }
}
