
import java.util.*; // import function which used in java..
public class GeneralTree{

// DFS = Deep First Serach..
// BFS = Beath First Serach...
  // Make the Constructor...
  public static class TreeNode{
    int data; // save the data value 
    List<TreeNode> children; // collect the child node

    TreeNode(int data){
        this.data =data;
        this.children = new ArrayList<>(); // this list where I store the value of Nodes...
    }
    
    // this function is help to add child node.. 
    void addChild(TreeNode child){
        children.add(child);
    }
    
  }

  TreeNode root;

  // this fcn is create the Root node (Parent Node)...
  public GeneralTree(int rootData){
    root = new TreeNode(rootData);
  }

  // display the tree values... which in Tree...
  public void printTree(TreeNode node, String space){

        if(node == null){
            System.out.println("The Tree is empty... they have no Node value..");
            return;
        }
        System.out.println(space + node.data);
        for(TreeNode child: node.children){
            printTree(child, space + "--");
        }

  }

  public static void main(String[]  args){
    // parent Node
    GeneralTree tree =  new GeneralTree(1);

    //child Node..
    TreeNode childone = new TreeNode(2);
    TreeNode childtwo = new TreeNode(3);
    TreeNode childthree = new TreeNode(4);


    tree.root.addChild(childone);
    tree.root.addChild(childtwo);
    tree.root.addChild(childthree);

    // this is sub child node...
    childone.addChild(new TreeNode(5));
    childone.addChild(new TreeNode(6));

    childtwo.addChild(new TreeNode(7));

    childthree.addChild(new TreeNode(8));
    childthree.addChild(new TreeNode(9));
    childthree.addChild(new TreeNode(10));

    System.out.println("Gerneral Tree Structure: ");
    tree.printTree(tree.root, " ");




  }

}