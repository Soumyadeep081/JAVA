package LinkedList.intro;
import java.util.LinkedList;
public class LL_framework {
    //Similar to ArrayList.
        public static void main(String[] args) {
            LinkedList<String> ll=new LinkedList <>();

            //Add elements
            ll.add("abc");
            ll.add("hii");
            ll.add(0,"no");
            ll.add(3,"yes");

            ll.addFirst("first"); //add at first
            ll.addLast("last"); //add at last


            //remove elements

            ll.removeFirst(); //remove first
            ll.removeLast(); //remove last
            ll.remove(3); //remove at any position


            //For replacement
            ll.set(1, "Tung");

            //Number of nodes
            System.out.println(ll.size());

            //Printing any node:
            System.out.println(ll.get(2));

            System.out.println(ll.getFirst()); //Printing last
            System.out.println(ll.getLast()); //printing last

            //Printing linkedlist
            System.out.println(ll);
        }
    }


