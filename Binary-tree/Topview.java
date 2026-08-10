import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topview {

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

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {

            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            // Left
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            // Right
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        // Print after BFS is complete
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
// to find common lca
    public static boolean getPath(Node root,int n, ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n){
            return true;
        }
        boolean leftFound=getPath(root.left, n, path);
        boolean rightFound=getPath(root.right, n, path);

        if(leftFound || rightFound){
            return true;
        }

        path.remove(path.size()-1);

        return false;
        
    }
    

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        // loop to find common lca
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                  break;
            }
        }
        Node lca=path1.get(i-1);
        return lca;
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        //topView(root);
        System.out.println(lca(root, 04, 5).data);
    }
}