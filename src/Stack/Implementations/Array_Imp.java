package Stack.Implementations;

import java.util.Scanner;

class stackk{
    private int max;
    private int tos;
    private int[] st;

    public stackk(int size){
        this.max=size;
        st=new int[max];
        tos=-1;
    }
    public void push(int data){
        if(tos==max-1){
            System.out.println("Stack Overflow");
            return;
        }
        tos++;
        st[tos]=data;
    }
    public void pop(){
        if(tos==-1){
            System.out.println("Empty stack");
            return;
        }
        System.out.println("Item popped: "+st[tos]);
        tos--;
    }
    public void display(){
        if(tos==-1){
            System.out.println("Empty Stack");
            return;
        }
        System.out.println("Stack:");
        for(int i=tos;i>=0;i--){
            System.out.println(st[i]);
        }
    }

}
public class Array_Imp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter stack size");
        int size=input.nextInt();
        stackk st=new stackk(size);
        int data;
        int ch;
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
