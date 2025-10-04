package Trees.Questions;



import java.util.LinkedList;
import java.util.Queue;

public class Q23 {
    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class pair {
        TreeNode root;
        int idx;

        pair(TreeNode root, int idx) {
            this.root = root;
            this.idx = idx;
        }
    }

    public static void main(String[] args) {
        //Maximum width of Binary tree:

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(widthOfBinaryTree(root));
    }

    public static int widthOfBinaryTree(TreeNode root) {
        return f(root);
    }

    private static int f(TreeNode root) {
        if (root == null) return 0;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        int max = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int lvl = q.peek().idx;
            int index = 0;
            for (int i = 0; i < size; i++) {
                pair p = q.poll();
                TreeNode curr = p.root;
                index = p.idx;
                if (curr.left != null) q.add(new pair(curr.left, 2 * index));
                if (curr.right != null) q.add(new pair(curr.right, 2 * index + 1));
            }
            max = Math.max(max, index - lvl + 1);
        }
        return max;

    }
}
