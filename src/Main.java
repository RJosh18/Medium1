public class Main {
    public static void main(String[] args) {
        BTNode root = new BTNode(6);
        root.left = new BTNode(2);
        root.right = new BTNode(8);
        root.left.left = new BTNode(0);
        root.left.right = new BTNode(4);
        root.right.left = new BTNode(7);
        root.left.right.left = new BTNode(3);
        root.left.right.right = new BTNode(5);
        BTNode p = root.left;
        BTNode q = root.left.right;
        BTNode x = lca(root, p, q);
        System.out.println("Lowest common ancestor:" + x.a);
    }

    public static BTNode lca(BTNode root, BTNode p, BTNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        else if (p.a < root.a && q.a < root.a) {
            return lca(root.left, p, q);
        }
        else if (p.a > root.a && q.a> root.a) {
            return lca(root.left.right, p, q);
        }
        else{
            return root;
        }
    }

}
