package dataStructure.tree;

public class TestTree {

  static Tree tree;

  public static void main(String[] args) {
    tree = new Tree();

    tree.add(10);
    tree.add(5);
    tree.add(15);

    tree.add(4);
    tree.add(8);
    tree.add(7);

    /*tree.add(6);
    tree.add(1);
    tree.add(3);

    tree.add(2);
    tree.add(13);
    tree.add(20);

    tree.add(18);
    tree.add(17);
    tree.add(19);

    tree.add(14);*/

    tree.traversePostOrder(tree.root);
    //tree.traversePreOrder(tree.root);

    //tree.printVertically(tree.root);
    //tree.printBoundaryNodes(tree.root);

  }

  private static void find(int value) {
    Node node = tree.find(tree.root, value);
    String nodeValue = node != null ? ((Integer) node.getValue()).toString() : "No Node found";
    System.out.println("Node Value : " + nodeValue);
  }

  private static void remove(int value) {
    tree.remove(value);
  }

  private static void printInPreOrder() {
    tree.traversePreOrder(tree.root);

  }

}
