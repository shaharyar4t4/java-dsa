public class creation_avl_tree {

    static class Node {
        int key;
        Node leftchild, righchild;
        int height;

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

        private Node root;

        // the below fnc is help to check the when node is empty....
        private int height(Node node) {
            return (node == null) ? 0 : node.height;
        }

        // the below fnc is help to find the balance factor value...
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
    }

}