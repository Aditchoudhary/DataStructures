package dataStructure.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class Tree {

  Node root = null;
  Node current = null;
  Node parent = null;

  int max;
  int min;

  class Top {

    Top(int level, int nodeValue) {
      this.level = level;
      this.nodeValue = nodeValue;
    }

    int level;
    int nodeValue;
  }

  public void add(int value) {
    //size is 0, means no node is added
    // in tree

    if (root == null) {
      root = new Node(value);
      current = root;
      return;
    }

    if (current == null) {
      current = new Node(value);
      if (parent.value > value) {
        parent.left = current;
      } else {
        parent.right = current;
      }
      current = root;
      return;
    }

    parent = current;

    if (value < current.value) {
      current = current.left;
      add(value);
    } else {
      current = current.right;
      add(value);
    }
  }

  public void remove(int value) {

    current = find(root, value);

    if (current == null) {
      System.out.println("Value: " + value + " is not available in tree");
      return;
    }

    //Case I (Deleted Node has No left and Right Child)
    if (current.left == null && current.right == null) {
      if (parent.value > current.value) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    }
    //Case II (Deleted Node has No Right Child but has Left Child)
    else if (current.right == null && current.left != null) {
      if (parent.value > current.value) {
        parent.left = current.left;
      } else {
        parent.right = current.left;
      }
    }
    //Case III (Deleted Node has Right child, And right has no left child)
    else if (current.right != null && current.right.left == null) {
      if (parent.value > current.value) {
        parent.left = current.right;
      } else {
        parent.right = current.right;
      }
    }
    ///Case IV (Deleted Node has Right and Right Child has Left Child)
    else if (current.right != null && current.right.left != null) {

      Node rightNode = current.right;
      Node leftNode = current.left;
      current = rightNode;

      //finding the last most left node
      Node prev = current;
      while (current.left != null) {
        prev = current;
        current = current.left;
      }
      prev.left = null;

      if (parent.value > current.value) {
        parent.left = current;
        current.right = rightNode;
        current.left = leftNode;
      } else {
        parent.right = current;
        current.right = rightNode;
        current.left = leftNode;
      }

    }

    current = root;
  }

  public Node find(Node current, int value) {
    if (current == null) {
      System.out.println("No Node found");
    } else if (current.value == value) {
      return current;
    } else if (current.value > value) {
      parent = current;
      return find(current.left, value);
    } else if (current.value < value) {
      parent = current;
      return find(current.right, value);
    }
    return null;
  }

  public void traversePreOrder(Node current) {

    if (current == null)
      return;
    process(current.value);
    traversePreOrder(current.left);
    traversePreOrder(current.right);

  }

  public void traversePostOrder(Node current) {
    if (current == null)
      return;
    traversePostOrder(current.left);
    traversePostOrder(current.right);
    process(current.value);
  }

  public void mirror(Node n) {
    if (n == null)
      return;
    mirror(n.left);
    mirror(n.right);

    Node temp = n.left;
    n.left = n.right;
    n.right = temp;
  }

  public void printVertically(Node node) {
    findMaxMin(node, 0);
    for (int line = min; line <= max; line++) {
      printLine(node, 0, line);
    }
  }

  public void printBoundaryNodes(Node node) {
    printLeftBoundary(node);
    printLeafNode(node);
    printRightBoundary(node.right);
  }

  public void printTopView(Node node) {
    findMaxMin(node, 0);

    int count = 0;
    int level = 0;
    HashMap<Integer, Top> hm = new HashMap<>();
    for (int line = min; line <= max; line++) {
      topView(node, count, line, level, hm);
    }
  }

  public Optional<Node> inOrderSuccessor(int valueToSearch) {

    Node node = new Node(valueToSearch);
    Optional<Node> foundNode = findNode(node, root);

    Optional<Node> successor = Optional.ofNullable(null);
    Optional<Node> ancestor = Optional.ofNullable(root);

    if (foundNode.get().right != null) {
      successor = findMin(foundNode.get().right);
    } else {
      while (ancestor.get().value != valueToSearch) {
        if (ancestor.get().value > valueToSearch) {
          successor = ancestor;
          ancestor = Optional.ofNullable(ancestor.get().left);
        } else {
          ancestor = Optional.ofNullable(ancestor.get().right);
        }
      }
    }
    return successor;
  }

  public void printInZigZagPattern(Node node) {

    Stack<Node> currentLevel = new Stack<>();
    Stack<Node> nextLevel = new Stack<>();
    boolean leftToRight = true;
    Node currentNode;
    currentLevel.push(node);
    while (currentLevel.isEmpty() != true) {
      currentNode = currentLevel.pop();
      System.out.print(currentNode.value + " ");

      if (leftToRight) {
        if (currentNode.left != null) {
          nextLevel.push(currentNode.left);
        }

        if (currentNode.right != null) {
          nextLevel.push(currentNode.right);
        }
      } else {
        if (currentNode.right != null) {
          nextLevel.push(currentNode.right);
        }

        if (currentNode.left != null) {
          nextLevel.push(currentNode.left);
        }
      }

      if (currentLevel.isEmpty()) {
        leftToRight = !leftToRight;
        Stack<Node> temp = nextLevel;
        nextLevel = currentLevel;
        currentLevel = temp;
      }
    }
  }

  private Optional<Node> findMin(Node node) {
    if (node.left != null) {
      while (node.left != null) {
        node = node.left;
      }
    }
    return Optional.of(node);
  }

  private Optional<Node> findNode(Node searchedNode, Node current) {
    if (current == null)
      return Optional.ofNullable(null);

    if (searchedNode.value < current.value) {
      current = current.left;
      return findNode(searchedNode, current);
    } else if (searchedNode.value > current.value) {
      current = current.right;
      return findNode(searchedNode, current);
    }
    return Optional.ofNullable(current);

  }

  private void printLeafNode(Node node) {

    if (node == null)
      return;

    if (node.left == null && node.right == null) {
      System.out.print(node.value + " ");
    }

    printLeafNode(node.left);
    printLeafNode(node.right);

  }

  private void printLeftBoundary(Node node) {
    if (node == null)
      return;

    if (node.left != null || node.right != null) {
      System.out.print(node.value + " ");
    }

    if (node.left == null && node.right != null) {
      printLeftBoundary(node.right);
    } else {
      printLeftBoundary(node.left);
    }

  }

  private void printRightBoundary(Node node) {
    if (node == null)
      return;

    if (node.right != null || node.left != null)
      System.out.print(node.value + " ");

    if (node.right == null && node.left != null)
      printRightBoundary(node.left);
    else
      printRightBoundary(node.right);
  }

  private void findMaxMin(Node node, int count) {

    if (node == null)
      return;
    if (count > max) {
      max = count;
    } else if (count < min) {
      min = count;
    }

    findMaxMin(node.left, count - 1);
    findMaxMin(node.right, count + 1);
  }

  private void printLine(Node node, int count, int line) {
    if (node == null)
      return;
    if (line == count) {
      System.out.print(node.value + " ");
    }
    printLine(node.left, count - 1, line);
    printLine(node.right, count + 1, line);
  }

  private void topView(Node node, int count, int line, int level, Map<Integer, Top> hm) {

    if (node == null)
      return;
    if (line == count) {

      if (hm.containsKey(count) && hm.get(count).level < level) {
        hm.put(count, new Top(level, node.value));
      }

      System.out.print(node.value + " ");
    }
    topView(node.left, count - 1, line, level + 1, hm);
    topView(node.right, count + 1, line, level + 1, hm);
  }

  private void process(int value) {
    System.out.print(value + ",");
  }
}
