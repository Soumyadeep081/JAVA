package LinkedList.intro;
import java.util.*;
public class DoublyLL {


    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        public static Node addAtbeg(Node head, int data) {
            Node temp = new Node(data);
            if (head == null) return temp;
            temp.next = head;
            head.prev = temp;
            return temp;
        }

        public static Node addAtLast(Node head, int data) {
            Node temp = new Node(data), ptr = head;
            if (head == null) return temp;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
            return head;
        }

        public static Node addAtanyPos(Node head, int data, int pos) {
            if (pos < 1) {
                System.out.println("Not possible");
                return head;
            }
            Node temp = new Node(data);
            if (pos == 1) return addAtbeg(head, data);
            if (head == null) return temp;
            else {
                Node ptr = head;
                pos--;
                while (pos != 1 && ptr != null) {
                    ptr = ptr.next;
                    pos--;
                }
                if (ptr == null) {
                    System.out.println("Position out of bounds");
                    return head;
                }
                temp.next = ptr.next;
                if (ptr.next != null) {
                    ptr.next.prev = temp;
                }
                temp.prev = ptr;
                ptr.next = temp;
                return head;

            }
        }

        public static Node deleteFirst(Node head) {
            if (head == null) {
                System.out.println("Empty ll");
                return null;
            }
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        public static Node deleteLast(Node head) {
            if (head == null) {
                System.out.println("Empty ll");
                return null;
            }
            if (head.next == null) return null;
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.prev.next = null;
            return head;
        }

        public static Node deleteAtanyPos(Node head, int pos) {
            if (head == null) {
                System.out.println("Empty ll");
                return null;
            }
            if (pos < 1) {
                System.out.println("Error");
                return head;
            }
            if (pos == 1) return deleteFirst(head);
            Node temp = head;
            while (pos != 1 && temp != null) {
                temp = temp.next;
                pos--;
            }
            if (temp == null) {
                System.out.println("Error: Position out of bounds");
                return head;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            return head;
        }

        public static void display(Node head) {
            if (head == null) {
                System.out.println("Empty LL");
                return;
            }
            System.out.println("Linked List:");
            while (head != null) {
                System.out.printf("%d->", head.data);
                head = head.next;
            }
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head = addAtbeg(head, 0);
            head = addAtLast(head, 2);
            head = addAtanyPos(head, 5, 4);
            head = deleteFirst(head);
            head = deleteLast(head);
            head = deleteAtanyPos(head, 2);
            display(head);
        }


}


