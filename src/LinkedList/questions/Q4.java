package LinkedList.questions;

public class Q4 extends Q1 {
    public static Node inter(Node l1,Node l2){
        //Intersection Between two LinkedList:

        Node a=l1,b=l2;
        int x=0,y=0;
        while(l1!=null){
            x++;
            l1=l1.next;
        }
        while(l2!=null){
            y++;
            l2=l2.next;
        }
        int c=0;
        if(x>y){
            c=x-y;
            while(c!=0){
                a=a.next;
                c--;
            }
        }
        else{
            c=y-x;
            while(c!=0){
                b=b.next;
                c--;
            }
        }
        while(a!=null&&b!=null){
            if(a==b) return a;
            else{
                a=a.next;
                b=b.next;
            }
        }
        return null;
    }
}
