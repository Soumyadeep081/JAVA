package Trees.Implementation;
import java.util.*;
public class Node_Imp {

  static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }



    static Scanner sc = new Scanner(System.in);
        static Node root = null;

        // Insert interactively (auto-traverse with Y/N choice)
        public static void insert() {
            System.out.print("Enter value to insert: ");
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (root == null) {
                root = newNode;
                System.out.println("Inserted " + val + " as root.");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.poll();

                System.out.print("Do you want to insert at node " + curr.data + "? (Y/N): ");
                char choice = sc.next().toUpperCase().charAt(0);

                if (choice == 'Y') {
                    System.out.print("Insert as Left or Right of " + curr.data + "? (L/R): ");
                    char dir = sc.next().toUpperCase().charAt(0);

                    if (dir == 'L') {
                        if (curr.left == null) {
                            curr.left = newNode;
                            System.out.println("Inserted " + val + " to the LEFT of " + curr.data);
                            return;
                        } else {
                            System.out.println("Left child already exists! Moving forward...");
                        }
                    } else if (dir == 'R') {
                        if (curr.right == null) {
                            curr.right = newNode;
                            System.out.println("Inserted " + val + " to the RIGHT of " + curr.data);
                            return;
                        } else {
                            System.out.println("Right child already exists! Moving forward...");
                        }
                    }
                }

                // Continue traversal if not inserted
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            System.out.println("Could not insert " + val + ". No suitable position found.");
        }

        // BFS Traversal with levels (pretty display)
        public static void display() {
            if (root == null) {
                System.out.println("Tree is empty!");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            System.out.println("Level Order Traversal (BFS by levels): ");
            while (!q.isEmpty()) {
                int levelSize = q.size(); // number of nodes at current level

                for (int i = 0; i < levelSize; i++) {
                    Node temp = q.poll();
                    System.out.print(temp.data + " ");

                    if (temp.left != null) q.add(temp.left);
                    if (temp.right != null) q.add(temp.right);
                }
                System.out.println(); // move to next line after each level
            }
        }

        // Menu
        public static void main(String[] args) {
            while (true) {
                System.out.println("\n--- Binary Tree Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Display (Level Order)");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: insert(); break;
                    case 2: display(); break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }


}
