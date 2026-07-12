public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // height of a tree
     public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight, rightHeight)+1;
     }
     // Daimeter of tree
     public static int diameter(Node root){
          if(root==null){
            return 0;
        }
        int leftDia=diameter(root.left);
        int leftHeight=height(root.left);
        int rightDia=diameter(root.right);
        int rightHeight=height(root.right);
        int selft=leftHeight+rightHeight+1;
        return Math.max(selft,Math.max(rightDia, leftDia));
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

       // preorder(root);
      //System.out.println("Height of tree: "+height(root));
        System.out.println("Diameter of tree: "+diameter(root));
    }
}