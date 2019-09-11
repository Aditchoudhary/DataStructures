package dataStructure.queue.linkedList;

public class Queue<T> {

  Node<T> head = null;
  Node<T> tail = null;
  int count = 0;

  public void enqueue(T value) {
    Node<T> element = new Node<>(value);
    // No element in Queue
    if (head == null && tail == null) {
      head = element;
      tail = element;
      count++;
    } else {
      // simply adding to the next of tail & assign it as tail
      tail.next = element;
      tail = element;
      count++;
    }
  }

  public int size() {
    return count;
  }

  public T dequeue() throws Exception {
    if (head!= null) {
      Node<T> element = head;
      head = head.next;
      count--;
      if(count== 0){
        tail = null;
        head = null;
      }
      return element.value;
    }else {
      throw new Exception("Queue is empty");
    }
  }
}
