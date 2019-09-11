package dataStructure.tree;

public class Node {
  Node right = null;
  Node left = null;
  int value;

  public Node(int value) {
    this.value = value;
  }

  public Node getRight() {
    return right;
  }

  public Node getLeft() {
    return left;
  }

  public int getValue() {
    return value;
  }
}
