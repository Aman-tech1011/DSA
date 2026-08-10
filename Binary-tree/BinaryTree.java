import java.util.*;
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
     // top view of tree
    static class Pair {
       Node node;
       int hd;

       Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
       }
        
    }
     public static void topView(Node root) {

    if (root == null) {
        return;
    }

    Queue<Pair> q = new LinkedList<>();
    TreeMap<Integer, Integer> map = new TreeMap<>();

    q.add(new Pair(root, 0));

    while (!q.isEmpty()) {

        Pair curr = q.remove();

        if (!map.containsKey(curr.hd)) {
            map.put(curr.hd, curr.node.data);
        }

        if (curr.node.left != null) {
            q.add(new Pair(curr.node.left, curr.hd - 1));
        }

        if (curr.node.right != null) {
            q.add(new Pair(curr.node.right, curr.hd + 1));
        }
    }

    for (int value : map.values()) {
        System.out.print(value + " ");
    }
}
// kth level of binary tree
    public static void kthLevel(Node root, int level, int k){
        if(root==null){
            return;
        }
        if(k==level){
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
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
        // System.out.println("Diameter of tree: "+diameter(root));
        // System.out.println("topview : ");
        // topView(root);
         int k=3;
         kthLevel(root, 1, 3);
    }
}