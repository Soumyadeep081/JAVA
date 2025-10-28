package Heap.Implementation;


import java.util.ArrayList;

public class Imp {
   static class Heap{
        ArrayList<Integer>a=new ArrayList<>();

        public void add(int item){
            this.a.add(item);
            upheapify(this.a.size()-1);
        }

        public int remove(){
                if(this.a.isEmpty()){
                    throw new RuntimeException("Heap is Empty");
                }
                int rv=a.get(0);

                int temp=this.a.get(0);
                this.a.set(0,a.get(a.size()-1));
                this.a.set(a.size()-1,temp);

                a.removeLast();
                downHeapify(0);

                return rv;
        }

        public void display(){
            System.out.println(a);
        }

       private void upheapify(int ci){
           int pi=(ci-1)/2;
           //Max Heap:
           if(a.get(ci)>a.get(pi)){
               int temp=a.get(ci);
               a.set(ci,a.get(pi));
               a.set(pi,temp);

               upheapify(pi);
           }

       }
       private void downHeapify(int pi){
           int largest=pi;
           int left=2*pi+1;
           int right=2*pi+2;

           if(left<a.size()&&a.get(left)>a.get(largest)){
               largest=left;
           }

           if(right<a.size()&&a.get(right)>a.get(largest)){
               largest=right;
           }

           if(largest!=pi){
               int temp=a.get(largest);
               a.set(largest,a.get(pi));
               a.set(pi,temp);

               downHeapify(largest);
           }
       }
    }

    public static void main(String[] args){
       Heap hp=new Heap();
        hp.add(10);
        hp.add(20);
        hp.add(5);
        hp.add(30);
        hp.display();

        System.out.println("Removed: " + hp.remove());
        hp.display();
    }




}
