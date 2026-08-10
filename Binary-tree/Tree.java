public class Tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // height of a tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // diameter of a tree
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftD = diameter(root.left);
        int rightD = diameter(root.right);
        int self = leftHeight + rightHeight + 1;

        return Math.max(self, Math.max(rightD, leftD));
    }

    // 2nd approach of diameter
    public static class Info {
        int diam;
        int height;

        public Info(int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info diameter2(Node root) {

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(
                Math.max(leftInfo.diam, rightInfo.diam),
                leftInfo.height + rightInfo.height + 1);

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diam, height);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        System.out.println(diameter(root));
    }
}
