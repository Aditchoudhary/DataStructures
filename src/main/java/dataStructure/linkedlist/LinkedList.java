package dataStructure.linkedlist;

public class LinkedList<T> {

  int count = 0;
  Node<T> head = null;
  Node<T> tail = null;

  public void addFirst(T value) {

    Node<T> newNode = new Node<>(value);
    if (count == 0) {
      head = newNode;
      tail = newNode;
      count++;
    } else {
      newNode.next = head;
      head = newNode;
      count++;
    }
  }

  public void add(T value) {
    Node<T> newNode = new Node<>(value);
    if (count == 0) {
      head = newNode;
      tail = newNode;
      count++;
    } else {
      tail.next = newNode;
      tail = newNode;
      count++;
    }
  }

  @SuppressWarnings("unchecked")
  public void printLinkedList() {
    Node<T> current;
    current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }


  @SuppressWarnings("unchecked")
  public void printLinkedList(Node<Integer> head) {
    Node<Integer> current;
    current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  @SuppressWarnings("unchecked")
  public void deleteAtLast() throws Exception {
    if (count == 0) {
      throw new Exception("LinkedList is Empty");
    } else {
      Node<T> current;
      current = head;
      while (current.next != null) {
        tail = current;
        current = current.next;
      }
      tail.next = null;
      count--;

    }
  }

  public int size() {
    return count;
  }

  public void findAndDeleteMiddle(Node<T> head) {

    Node<T> fast = head;
    Node<T> slow = head;
    Node<T> slowPrev = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slowPrev = slow;
      slow = slow.next;
    }

    slowPrev.next = slow.next;
  }

  public void getMiddleElement(Node<T> head) {
    Node<T> fast = head;
    Node<T> slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

    }
    System.out.println(slow.value);
  }

  //using recursion in this
  //@source https://www.geeksforgeeks.org/print-reverse-of-a-linked-list-without-actually-reversing/
  public void printReverse(Node<T> head) {

    if (head == null)
      return;

    printReverse(head.next);

    System.out.println(head.value);

  }

  //
  public void printReverseLinkedListUsingThreePointer(Node<T> head) {

    Node<T> current = head;
    Node<T> previous = null;
    Node<T> next = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    head = previous;
    current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  /**
   * Reversing using 3 ptr.
   *
   * @param head
   * @return
   */
  @SuppressWarnings("unchecked")
  public Node<Integer> reverseLinkedListUsingThreePoint(Node<Integer> head) {
    Node<Integer> prev, next, current;
    current = head;
    prev = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  public void reverse(Node<T> prev, Node<T> current) {

    if (current == null) {
      head = prev;
      return;

    }
    reverse(current, current.next);
    current.next = prev;

  }

  /**
   * @param head
   * @about Add 1 to a number represented as linked list
   * @author Adit
   * @source https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
   */
  public void AddOne(Node<Integer> head) {
    head = reverseLinkedListUsingThreePoint(head);

    Node<Integer> current = head;
    int carry = 0;
    Node<Integer> prev = null;
    boolean addedOne = true;
    while (current != null) {
      int nodeValue = (int) current.value + carry;

      if (addedOne) {
        nodeValue = nodeValue + 1;
        addedOne = false;
      }
      carry = nodeValue / 10;
      int remainder = nodeValue % 10;
      current.value = remainder;
      prev = current;
      current = current.next;

    }

    head = reverseLinkedListUsingThreePoint(head);
    printLinkedList(head);
  }

  /**
   * Rotates the LinkedList with k times
   *
   * @param head
   * @param k
   * @return
   */
  public Node<T> rotate(Node<T> head, int k) {
    Node<T> current = head;
    Node<T> firstNode = head;
    Node<T> lastNode = head;
    int countOfNode = 1;
    while (current != null) {
      lastNode = current;
      if (countOfNode == k) {
        Node<T> next = current.next;
        current.next = null;
        current = next;
      } else if (countOfNode == k + 1) {
        head = current;
        current = current.next;
      } else {
        current = current.next;
      }
      countOfNode++;

    }
    lastNode.next = firstNode;
    return head;
  }

  public Node<T> mergeTwoLinkedList(Node<T> fhead, Node<T> shead) {

    Node<T> fCurrent = fhead;
    Node<T> sCurrent = shead;

    while (fCurrent != null && sCurrent != null) {

      Node<T> fnext = fCurrent.next;
      Node<T> snext = sCurrent.next;

      fCurrent.next = sCurrent;
      sCurrent.next = fnext;

      fCurrent = fnext;
      sCurrent = snext;

    }

    return sCurrent;
  }

  Node<T> next = null;
  Node<T> prev = null;
  Node<T> leftCurrent = null;
  Node<T> leftPrevious = null;

  /**
   * with k=2
   * 1->2->3->4->5->6
   * 2->1->4-3->6->5
   * @param current
   * @param k
   */
  public void rotateWithK(Node<T> current, int k) {
    if(current == null){
      leftPrevious.next =null;
      return;
    }
    leftCurrent = current;
    int val = k;
    while (val >= 1 && current!=null){
      next = current.next;
      current.next = prev;

      prev = current;
      current = next;
      val--;
    }

    if (leftPrevious == null) {
      head = prev;
    }

    if (leftPrevious != null) {
      leftPrevious.next = prev;
      leftPrevious = leftCurrent;
    } else {
      leftPrevious = leftCurrent;
    }

    rotateWithK(current, k);
  }
}
