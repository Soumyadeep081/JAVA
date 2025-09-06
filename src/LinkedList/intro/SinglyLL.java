package LinkedList.intro;

import java.util.Scanner;

public class SinglyLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


        //It is a linear data structure that is used for storing collections of data.

        //Creating first node:
        public static void main(String[] args) {

            // Head is the pointer which contains the address of first node.
            Node Head = new Node(5);

            Head.next = null;

            //Creating second node:
            Node curr = new Node(10);

            curr.next = null;

            //Linking the first node to the second node:
            Head.next = curr;

            //Traversing the linked list:
            while (Head != null) {
                System.out.printf("%d\t", Head.data);
                Head = Head.next;
            }
            Scanner input = new Scanner(System.in);
            Node head;
            System.out.println("Enter data for first node");
            int data = input.nextInt();
            head = createFirstNode(data);
            head = addAtbeg(head, 0);
            display(head);
            head = addAtlast(head, 2);
            display(head);
            head = addAtanypos(head, 3, 2);
            display(head);
            head = delLast(head);
            head = DelFirst(head);
            head = delAtpos(head, 2);
            display(head);

        }


        //Traversal:
        //Time complexity=O(n)

        public static void traverse() {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);

            display(head);
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }


        //Insert at beginning:
        //Time complexity=O(1)


        public static Node createFirstNode(int data) {
            return new Node(data);
        }

        public static Node addAtbeg(Node head, int data) {
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }


        //Insert at last:
        //Time complexity=O(n)

        public static Node addAtlast(Node head, int data) {
            Node temp = new Node(data);
            Node ptr = head;
            if (head == null) {
                return temp;
            }
            if (head.next == null) {
                head.next = temp;
                return head;
            }
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
            return head;

        }


        //Insert at any position:
        //Time complexity=O()

        public static Node addAtanypos(Node head, int data, int pos) {
            if (pos <= 0) {
                System.out.println("Error");
                return head;
            }
            Node temp = new Node(data);
            if (head == null) {
                return temp;
            } else if (pos == 1) {
                return addAtbeg(head, data);
            } else {
                Node ptr = head;
                for (int i = 1; i < pos - 1; i++) {
                    if (ptr == null) {
                        System.out.println("Out of bound");
                        return head;
                    }
                    ptr = ptr.next;

                }
                if (ptr == null) {
                    System.out.println("Out of bound");
                    return head;
                }
                temp.next = ptr.next;
                ptr.next = temp;
                return head;
            }
        }


        //Deleting the first node:
        public static Node DelFirst(Node head) {
            if (head == null) {
                System.out.println("Empty ll");
                return null;
            }
            return head.next;
        }

        //Deleting the last node:
        public static Node delLast(Node head) {
            if (head == null) {
                System.out.println("Empty ll");
                return null;
            }
            if (head.next == null) {
                return null;
            }
            Node ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
            return head;
        }

        //Deleting at any position:
        public static Node delAtpos(Node head, int pos) {
            if (head == null) {
                System.out.println("Empty ll");
                return null;
            }

            if (pos == 1) {
                return DelFirst(head);
            }

            Node prev = head;
            for (int i = 1; i < pos - 1; i++) {
                if (prev.next == null) {
                    System.out.println("Position out of bounds");
                    return head;
                }
                prev = prev.next;
            }

            Node toDelete = prev.next;
            if (toDelete == null) {
                System.out.println("Position out of bounds");
                return head;
            }

            prev.next = toDelete.next;
            toDelete = null;
            return head;
        }



}


