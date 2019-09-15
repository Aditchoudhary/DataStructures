package dataStructure.tree;

import java.util.Optional;

public class TestTree {

  static Tree tree;

  public static void main(String[] args) {
    tree = createTree();
    printZigZigTree();
  }

  private static  Tree createTree(){
    Tree tree = new Tree();

    tree.add(10);
    tree.add(5);
    tree.add(20);

    tree.add(4);
    tree.add(8);
    tree.add(7);

    tree.add(13);
    tree.add(14);

    tree.add(15);
    tree.add(16);
    tree.add(12);

    return tree;
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

  private static void printInOrderSuccessor() {
    tree = new Tree();

    tree.add(10);
    tree.add(5);
    tree.add(20);

    tree.add(4);
    tree.add(8);
    tree.add(7);

    tree.add(13);
    tree.add(14);

    tree.add(15);
    tree.add(16);
    tree.add(12);
    tree.add(11);
    tree.add(30);
    tree.add(25);

    Optional<Node> found = tree.inOrderSuccessor(13);
    System.out.println(found.isPresent());

    found.map(f -> f.value)
      .ifPresent(System.out::println);

  }

  private static  void printZigZigTree(){
    tree.printInZigZagPattern(tree.root);
  }

}
