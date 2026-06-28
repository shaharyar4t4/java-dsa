import java.util.Scanner;

public class BinarySerachTree {

    static class Node {
        int data;
        Node rightchild, leftchild;

        Node(int data) {
            this.data = data;
            rightchild = leftchild = null;
        }
    }

    Node root;

    // this func is show that the initall tree is equal tu null...
    BinarySerachTree() {
        root = null;
    }

    // insert the value in tree.. means it just take user input from users..
    void insert(int value) {
        root = inserRec(root, value);
    }

    // main logic for insert the value in func...
    // (Incestion process)
    Node inserRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            System.out.println("Inserted: " + value);
            return root;
        }
        // this condition is show that the if value is small so they move toward the
        // left child part..other is else if part for right side part...
        if (value < root.data) {
            root.leftchild = inserRec(root.leftchild, value);
        } else if (value > root.data) {
            root.rightchild = inserRec(root.rightchild, value);
        }

        else {
            System.out.println("Value " + value + "already exist");
        }

        return root;
    }

    // important notes: binary seach tree me hum most of the time hum inorder
    // process use karta ha for sorting...
    // beasuse it used the rule of left -> Root -> Right.. (traversaing process)
    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.leftchild);
        System.out.print(root.data + " ");
        inorder(root.rightchild);
    }

    // Efficent way for Searching the value in (BST)...
    boolean searchvalue(Node root, int key) {
        // base condition.. (key value is not found..)
        if (root == null) {
            return false;
        }
        // found the key so the ...
        if (root.data == key) {
            return true;
        }

        // the value is small to go on left sub tree...
        // the value is big to go on right sub tree...
        // the process is called recursive search...
        // for small key value...
        if (key < root.data) {
            return searchvalue(root.leftchild, key);
        } else {
            return searchvalue(root.rightchild, key);
        }
    }

    public static void main(String[] args) {
        BinarySerachTree bTree = new BinarySerachTree();
        bTree.insert(50);
        bTree.insert(40);
        bTree.insert(30);
        bTree.insert(20);
        bTree.insert(70);
        bTree.insert(80);
        bTree.insert(90);

        System.out.println("After the BST process...\n ");
        bTree.inorder(bTree.root);

        int keyvalue;
        System.out.println("\nEnter the value which you want to find... ");
        Scanner input = new Scanner(System.in);
        keyvalue = input.nextInt();
        System.out.println("\nSeaching for " + keyvalue + ".......");
        if (bTree.searchvalue(bTree.root, keyvalue)) {
            System.out.println("Node: " + keyvalue + " found in BST");
        } else {
            System.out.println("Node is not found");
        }

    }

}
