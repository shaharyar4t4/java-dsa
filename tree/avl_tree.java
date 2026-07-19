public class avl_tree {

    static class Node {
        int key;
        Node leftchild, righchild;
        int height;

        // interveiw question..
        // if the tree is grow from left side the value must be (positive) ..
        // left - right = 4-3 => 1
        // if the tree is grow from right side the value must be (negative)...
        // left - right = 3 -4 => -1
        Node(int key) {
            this.key = key;
            // important intervier abhi start me tree me koi node add tu nhi phir is height
            // ki value 1 q ha ?
            // reson one: as we know that the fromula of avl tree height calculation is that
            // 1 + max(leftchild)(rightchild) ==> 1 + 0 => 1
            // agar me is ko 0 assign karta ho means koi node nhi ha jab kiya ap na parent
            // ko bnya jese ki waja se ye 1 kko assign karna hoga..
            this.height = 1;
        }
    }

    private Node root;

    // the below fnc is help to check the when node is empty....
    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // the below fnc is help to find the balance factor value... or balance your
    // height
    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.leftchild) - height(node.righchild);
    }

    // this below fnc is help to agr tu tree left side par apna lenght ko increase
    // karti ha tu is ko balance karna right rotation karna hoga..
    private Node rotateRight(Node parent) {
        Node leftNode = parent.leftchild;
        Node temp = leftNode.righchild;

        leftNode.righchild = parent;
        parent.leftchild = temp;
        // apply the formula 1 + max(leftchild)(rightchild)
        parent.height = Math.max(height(parent.leftchild), height(parent.righchild)) + 1;
        leftNode.height = Math.max(height(leftNode.leftchild), height(leftNode.righchild)) + 1;

        return leftNode;
    }

    // this below fnc is help to agr tu tree right side par apna lenght ko increase
    // karti ha tu is ko balance karna left rotation karna hoga..
    private Node rotateLeft(Node parent) {
        Node rightNode = parent.righchild;
        Node temp = rightNode.leftchild;

        rightNode.leftchild = parent;
        parent.righchild = temp;
        // apply the formula 1 + max(leftchild)(rightchild)
        parent.height = Math.max(height(parent.leftchild), height(parent.righchild)) + 1;
        rightNode.height = Math.max(height(rightNode.leftchild), height(rightNode.righchild)) + 1;

        return rightNode;
    }

    // insection operation..
    public void insert(int key) {
        // puspose is ka fnc?
        // manage the height
        // insection opeation
        // calculate the balance factor.
        // preform rotation..
        root = insertRec(root, key);

        System.out.println("Inserted: " + key);
    }

    // actual insertion logic
    private Node insertRec(Node node, int key) {
        // the tree have no node so the 1st node become the parent node..
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.leftchild = insertRec(node.leftchild, key);
        } else if (key > node.key) {
            node.righchild = insertRec(node.righchild, key);
        } else {
            return node;
        }
        // updated height ---> jab ap ki value new add hogi phir ap apni height ki value
        // ko update karya ga..
        node.height = 1 + Math.max(height(node.leftchild), height(node.righchild));
        int balance = getBalance(node);

        // make BF(balance factor) = 1, -1, 0 or ager 1 se above hota phir hum rotation
        // prefrom hoga
        // LL Rotation
        if (balance > 1 && key < node.leftchild.key) {
            return rotateRight(node); // must result reautl in positive
        }
        // RR Rotation..
        if (balance < -1 && key > node.righchild.key) {
            return rotateLeft(node);
        }
        // LR rotation
        if (balance > 1 && key > node.righchild.key) {
            node.leftchild = rotateLeft(node.leftchild);
            return rotateRight(node);
        }
        // RL Rotation
        if (balance < -1 && key < node.leftchild.key) {
            node.righchild = rotateRight(node.righchild);
            return rotateLeft(node);
        }
        return node;
    }

    // prefrom inorder traversal..
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.leftchild);
            System.out.println(node.key + " ");
            inorderRec(node.righchild);
        }
    }

    // Seraching feacture.
    // time complex ===> o(n), Olog(n)
    public boolean serach(int key) {
        return serachRec(root, key);
    }

    private boolean serachRec(Node node, int key) {
        // if the node value is not in tree so it become false mtlab kiya ap ki node
        // value nhi ha ...
        if (node == null) {
            return false;
        }
        // if the node value is found in tree so it become true mtlab ap ki value node
        // me ha ..
        if (key == node.key) {
            return true;
        }
        // if the node value small so move the left side tree while value is big then
        // root node value so they move from the right treee..
        return (key < node.key) ? serachRec(node.leftchild, key) : serachRec(node.righchild, key);
    }

    public static void main(String[] args) {
        avl_tree avltree = new avl_tree();
        avltree.insert(30);
        avltree.insert(50);
        avltree.insert(10);
        avltree.insert(70);
        avltree.insert(40);
        avltree.insert(25);

        System.out.println("\n Inorder Treaversal");
        avltree.inorder();

        System.out.println("\n Seraching input node value");
        System.out.println("serach:  25 => " + avltree.serach(25));
        System.out.println("Serach:  80 => " + avltree.serach(80));
    }
}
