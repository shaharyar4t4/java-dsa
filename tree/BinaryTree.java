public class BinaryTree {
    static class Node {
        int data;
        Node leftchild, rightchild;

        Node(int data) {
            this.data = data;
            leftchild = rightchild = null;
        }
    }

    Node root;

    // this constructor is help to create the root node..
    BinaryTree(int rootData) {
        root = new Node(rootData);
    }

    // Inorder traveeing.. (Left, root, right)
    void inorder(Node node) {
        // the fnc shows the node is empty...
        if (node == null)
            return;

        // this process is recusion means call it self..
        // specific for left sub tree..
        inorder(node.leftchild);
        // specific for root tree..
        System.out.print(node.data + " ");
        // specific for right tree...
        inorder(node.rightchild);
    }

    // preorder traveeing.. (root, left, right)
    void preorder(Node node) {
        // the fnc shows the node is empty...
        if (node == null)
            return;

        // this process is recusion means call it self..
        // specific for root tree..
        System.out.print(node.data + " ");
        // specific for left sub tree..
        preorder(node.leftchild);
        // specific for right tree...
        preorder(node.rightchild);
    }

    // preorder traveeing.. (left, right, root)
    void postorder(Node node) {
        // the fnc shows the node is empty...
        if (node == null)
            return;

        // this process is recusion means call it self..
        // specific for left sub tree..
        postorder(node.leftchild);
        // specific for right tree...
        postorder(node.rightchild);
        // specific for root tree..
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree(1);

        // ye left ki value or (left Root ha)..
        bTree.root.leftchild = new Node(2);
        // ye right ki value or (right Root ha)..
        bTree.root.rightchild = new Node(3);

        // ye left kiya bha left value ha..
        bTree.root.leftchild.leftchild = new Node(4);
        // ye left kiya bha right value ha..
        bTree.root.leftchild.rightchild = new Node(5);
        // ye right kiya bha left value ha..
        bTree.root.rightchild.leftchild = new Node(6);
        // ye right kiya bha right value ha..
        bTree.root.rightchild.rightchild = new Node(7);

        System.out.println(" Inorder Travering....");
        bTree.inorder(bTree.root);
        System.out.println();

        System.out.println(" preorder Travering....");
        bTree.preorder(bTree.root);
        System.out.println();

        System.out.println(" postorder Travering....");
        bTree.postorder(bTree.root);
        System.out.println();
    }
}